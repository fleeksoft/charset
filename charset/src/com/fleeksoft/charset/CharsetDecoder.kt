package com.fleeksoft.charset

import com.fleeksoft.charset.internal.ArraysSupport
import com.fleeksoft.charset.internal.assert
import com.fleeksoft.charset.io.ByteBuffer
import com.fleeksoft.charset.io.CharBuffer
import com.fleeksoft.charset.io.CoderMalfunctionError
import kotlin.math.min

abstract class CharsetDecoder(
    val charset: Charset,
    val averageCharsPerByte: Float,
    val maxCharsPerByte: Float
) {

    init {
        require(averageCharsPerByte > 0.0f) { "averageCharsPerByte must be positive, was $averageCharsPerByte" }
        require(maxCharsPerByte > 0.0f) { "maxCharsPerByte must be positive, was $maxCharsPerByte" }
        require(!(averageCharsPerByte > maxCharsPerByte)) { "averageCharsPerByte must not greater than maxCharsPerByte, was $averageCharsPerByte" }
    }

    companion object {
        const val ST_RESET = 0
        const val ST_CODING = 1
        const val ST_END = 2
        const val ST_FLUSHED = 3

        val stateNames: Array<String> = arrayOf("RESET", "CODING", "CODING_END", "FLUSHED")
    }

    private var state: Int = ST_RESET

    var malformedInputAction: CodingErrorAction = CodingErrorAction.REPORT
        private set
    var unmappableCharacterAction: CodingErrorAction = CodingErrorAction.REPORT
        private set

    protected var replacement: String = "\uFFFD"
        private set

    fun decode(byteBuffer: ByteBuffer, outCharBuffer: CharBuffer, endOfInput: Boolean): CoderResult {
        val newState: Int = if (endOfInput) ST_END else ST_CODING
        if ((state != ST_RESET) && (state != ST_CODING)
            && !(endOfInput && (state == ST_END))
        ) throwIllegalStateException(state, newState)
        state = newState

        while (true) {
            var cr: CoderResult
            try {
                cr = decodeLoop(byteBuffer, outCharBuffer)
            } catch (x: RuntimeException) {
                throw CoderMalfunctionError(x)
            }

            if (cr.isOverflow) return cr

            if (cr.isUnderflow) {
                if (endOfInput && byteBuffer.hasRemaining()) {
                    cr = CoderResult.malformedForLength(byteBuffer.remaining())
                    // Fall through to malformed-input case
                } else {
                    return cr
                }
            }

            var action: CodingErrorAction? = null
            if (cr.isMalformed) action = malformedInputAction
            else if (cr.isUnmappable) action = unmappableCharacterAction
            else assert(false) { cr.toString() }

            if (action == CodingErrorAction.REPORT) return cr

            if (action == CodingErrorAction.REPLACE) {
                if (outCharBuffer.remaining() < replacement.length) return CoderResult.OVERFLOW
                outCharBuffer.put(replacement)
            }

            if ((action == CodingErrorAction.IGNORE) || (action == CodingErrorAction.REPLACE)) {
                // Skip erroneous input either way
                byteBuffer.position(byteBuffer.position() + cr.length())
                continue
            }

            assert(false)
        }
    }

    fun decode(inByteBuffer: ByteBuffer): CharBuffer {
        var n: Int = min((inByteBuffer.remaining() * averageCharsPerByte).toInt(), ArraysSupport.SOFT_MAX_ARRAY_LENGTH)
        var out: CharBuffer = CharBuffer.allocate(n)

        if ((n == 0) && (inByteBuffer.remaining() == 0)) return out
        reset()
        while (true) {
            var cr: CoderResult = if (inByteBuffer.hasRemaining()) decode(inByteBuffer, out, true) else CoderResult.UNDERFLOW
            if (cr.isUnderflow) cr = flush(out)

            if (cr.isUnderflow) break
            if (cr.isOverflow) {
                // Ensure progress; n might be 0!
                n = ArraysSupport.newLength(n, min(n + 1, 1024), n + 1)
                val o: CharBuffer = CharBuffer.allocate(n)
                out.flip()
                o.put(out)
                out = o
                continue
            }
            cr.throwException()
        }
        out.flip()
        return out
    }

    fun flush(out: CharBuffer): CoderResult {
        if (state == ST_END) {
            val cr: CoderResult = implFlush(out)
            if (cr.isUnderflow) state = ST_FLUSHED
            return cr
        }

        if (state != ST_FLUSHED) throwIllegalStateException(state, ST_FLUSHED)

        return CoderResult.UNDERFLOW // Already flushed
    }

    abstract fun decodeLoop(byteBuffer: ByteBuffer, charBuffer: CharBuffer): CoderResult

    private fun throwIllegalStateException(from: Int, to: Int) {
        throw IllegalStateException("Current state = ${stateNames[from]}, new state = ${stateNames[to]}")
    }

    /**
     * Flushes this decoder.
     *
     * <p> The default implementation of this method does nothing, and always
     * returns {@link CoderResult#UNDERFLOW}.  This method should be overridden
     * by decoders that may need to write final characters to the output buffer
     * once the entire input sequence has been read. </p>
     *
     * @param  out
     *         The output character buffer
     *
     * @return  A coder-result object, either {@link CoderResult#UNDERFLOW} or
     *          {@link CoderResult#OVERFLOW}
     */
    open fun implFlush(out: CharBuffer): CoderResult {
        return CoderResult.UNDERFLOW
    }


    /*public final CharsetDecoder onMalformedInput(CodingErrorAction newAction) {
        if (newAction == null)
            throw new IllegalArgumentException("Null action");
        malformedInputAction = newAction;
        implOnMalformedInput(newAction);
        return this;
    }*/

    fun onMalformedInput(newAction: CodingErrorAction): CharsetDecoder {
        malformedInputAction = newAction
        implOnMalformedInput(newAction)
        return this
    }

    protected open fun implOnMalformedInput(newAction: CodingErrorAction) {}

    fun onUnmappableCharacter(newAction: CodingErrorAction): CharsetDecoder {
        unmappableCharacterAction = newAction
        implOnUnmappableCharacter(newAction)
        return this
    }

    protected open fun implOnUnmappableCharacter(newAction: CodingErrorAction) {}

    /**
     * Resets this decoder, clearing any internal state.
     *
     * This method resets charset-independent state and also invokes the
     * [implReset] method to perform any charset-specific reset actions.
     *
     * @return This decoder
     */
    fun reset(): CharsetDecoder {
        implReset()
        state = ST_RESET
        return this
    }

    /**
     * Resets this decoder, clearing any charset-specific internal state.
     *
     * The default implementation of this method does nothing. This method
     * should be overridden by decoders that maintain internal state.
     */
    protected open fun implReset() {}
}

enum class CodingErrorAction {
    IGNORE, REPLACE, REPORT
}
