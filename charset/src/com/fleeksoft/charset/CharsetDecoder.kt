package com.fleeksoft.charset

import com.fleeksoft.charset.io.ByteBuffer
import com.fleeksoft.charset.io.CharBuffer

expect abstract class CharsetDecoder protected constructor(
    _charset: Charset,
    averageCharsPerByte: Float,
    maxCharsPerByte: Float
) {

    fun charset(): Charset

    fun averageCharsPerByte(): Float
    fun maxCharsPerByte(): Float

    fun malformedInputAction(): CodingErrorAction
    fun unmappableCharacterAction(): CodingErrorAction

    protected fun replacement(): String
    protected open fun implReplaceWith(newReplacement: String)

    fun decode(byteBuffer: ByteBuffer, outCharBuffer: CharBuffer, endOfInput: Boolean): CoderResult

    fun decode(inByteBuffer: ByteBuffer): CharBuffer

    fun flush(out: CharBuffer): CoderResult

    protected abstract fun decodeLoop(byteBuffer: ByteBuffer, charBuffer: CharBuffer): CoderResult

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
    protected open fun implFlush(out: CharBuffer): CoderResult


    fun onMalformedInput(newAction: CodingErrorAction): CharsetDecoder

    protected open fun implOnMalformedInput(newAction: CodingErrorAction)

    fun onUnmappableCharacter(newAction: CodingErrorAction): CharsetDecoder

    protected open fun implOnUnmappableCharacter(newAction: CodingErrorAction)

    /**
     * Resets this decoder, clearing any internal state.
     *
     * This method resets charset-independent state and also invokes the
     * [implReset] method to perform any charset-specific reset actions.
     *
     * @return This decoder
     */
    fun reset(): CharsetDecoder

    /**
     * Resets this decoder, clearing any charset-specific internal state.
     *
     * The default implementation of this method does nothing. This method
     * should be overridden by decoders that maintain internal state.
     */
    protected open fun implReset()
}
