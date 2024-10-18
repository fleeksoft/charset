package com.fleeksoft.charset.io

import com.fleeksoft.charset.internal.assert

class ByteBuffer(byteArray: ByteArray, position: Int, offset: Int, limit: Int, mark: Int = -1, readOnly: Boolean = false) :
    Buffer<ByteArray>(
        bufferArray = byteArray,
        bufferPosition = position,
        bufferOffset = offset,
        bufferLimit = limit,
        capacity = byteArray.size,
        readOnly = readOnly,
        bufferMark = mark
    ) {

    fun get(): Int = bufferArray[ix(nextGetIndex())].toInt()
    fun getByte(): Byte = bufferArray[ix(nextGetIndex())]

    fun get(i: Int): Byte {
        return bufferArray[ix(checkIndex(i))]
    }

    fun getAvailableArray(): ByteArray {
        val pos = position()
        val arr = bufferArray.copyOfRange(ix(pos), limit())
        position(pos + arr.size)
        return arr
    }

    fun get(dst: ByteArray, offset: Int = 0, length: Int = dst.size): ByteBuffer {
        checkFromIndexSize(offset, length, dst.size)
        val pos = position()
        if (length > limit() - pos) throw BufferUnderflowException()
        dst.copyInto(dst, offset, ix(pos), length)
        position(pos + length);
        return this
    }

    fun put(bytes: ByteArray, offset: Int = 0, length: Int = bytes.size): ByteBuffer {
        if (readOnly) {
            throw ReadOnlyException()
        }
        val pos = position()
        if (length > limit() - pos) throw BufferOverflowException();

        putArray(pos, bytes, offset, length);

        position(pos + length)
        return this
    }

    fun putArray(index: Int, bytes: ByteArray, offset: Int, length: Int) {
        // TODO: test it jdk doing this with address
        bytes.copyInto(bufferArray, destinationOffset = ix(index), startIndex = offset, endIndex = offset + length)
    }

    fun put(byte: Byte): ByteBuffer {
        if (readOnly) {
            throw ReadOnlyException()
        }
        bufferArray[ix(nextPutIndex())] = byte

        return this
    }

    fun put(src: ByteBuffer): ByteBuffer {
        if (readOnly) {
            throw ReadOnlyException()
        }

        val srcPos = src.position();
        val srcLim = src.limit();
        val srcRem = (if (srcPos <= srcLim) srcLim - srcPos else 0);
        val pos = position();
        val lim = limit();
        val rem = (if (pos <= lim) lim - pos else 0);

        if (srcRem > rem) throw BufferOverflowException();

        putBuffer(pos, src, srcPos, srcRem)

        position(pos + srcRem);
        src.position(srcPos + srcRem);

        return this
    }

    fun copyInto(dst: ByteBuffer, destOffset: Int = 0, srcPos: Int = 0, length: Int): ByteBuffer {
        bufferArray.copyInto(dst.bufferArray, destinationOffset = destOffset, startIndex = srcPos, endIndex = srcPos + length)
        return this
    }

    private fun putBuffer(pos: Int, src: ByteBuffer, srcPos: Int, srcRem: Int): ByteBuffer {
        return src.copyInto(this, destOffset = ix(pos), srcPos, srcRem)
    }

    override fun position(newPosition: Int): ByteBuffer {
        super.position(newPosition)
        return this
    }

    fun duplicate(): ByteBuffer {
        return ByteBuffer(byteArray = bufferArray, position = bufferPosition, offset = bufferOffset, limit = bufferLimit, readOnly = readOnly, mark = markValue())
    }

    override fun asReadOnlyBuffer(): ByteBuffer {
        return ByteBuffer(byteArray = bufferArray, position = bufferPosition, offset = bufferOffset, limit = bufferLimit, readOnly = true, mark = markValue())
    }

    override fun flip(): ByteBuffer {
        super.flip()
        return this
    }

    override fun clear(): ByteBuffer {
        super.clear()
        return this
    }

    fun compact(): ByteBuffer {
        val pos = position()
        val lim = limit()
        assert(pos <= lim)
        val rem = if (pos <= lim) lim - pos else 0
//        System.arraycopy(hb, ix(pos), hb, ix(0), rem);
        bufferArray.copyInto(bufferArray, destinationOffset = ix(0), startIndex = ix(pos), endIndex = ix(pos) + rem)
        position(rem)
        limit(capacity)
        discardMark()
        return this
    }

    companion object {
        fun wrap(array: ByteArray, offset: Int = 0, length: Int = array.size): ByteBuffer = ByteBuffer(
            byteArray = array,
            position = offset,
            offset = 0,
            limit = offset + length
        )

        fun allocate(capacity: Int): ByteBuffer {
            // todo: test it
            require(capacity >= 0) { "capacity must be >= 0" }
            return ByteBuffer(
                byteArray = ByteArray(capacity),
                position = 0,
                offset = 0,
                limit = capacity
            )
        }
    }
}