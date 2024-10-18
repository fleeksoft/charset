package com.fleeksoft.charset.io

class CharBuffer(
    charArray: CharArray,
    position: Int,
    offset: Int,
    limit: Int,
    mark: Int = -1,
    capacity: Int = charArray.size,
    readOnly: Boolean = false
) :
    Buffer<CharArray>(
        bufferArray = charArray,
        bufferPosition = position,
        bufferOffset = offset,
        bufferLimit = limit,
        capacity = capacity,
        readOnly = readOnly,
        bufferMark = mark
    ),
    Appendable, CharSequence {

    fun get(): Char = bufferArray[ix(nextGetIndex())]

    override fun get(index: Int): Char {
        return bufferArray[ix(checkIndex(index))]
    }

    fun put(char: Char): CharBuffer {
        if (readOnly) {
            throw ReadOnlyException()
        }
        bufferArray[ix(nextPutIndex())] = char
        return this
    }

    fun put(index: Int, char: Char): CharBuffer {
        if (readOnly) {
            throw ReadOnlyException()
        }
        bufferArray[ix(checkIndex(index))] = char
        return this
    }

    fun put(value: String): CharBuffer {
        if (readOnly) {
            throw ReadOnlyException()
        }
        value.forEach {
            this.put(it)
        }

        return this
    }

    fun put(src: CharBuffer): CharBuffer {
        if (readOnly) {
            throw ReadOnlyException()
        }
        if (src == this) throw Exception("The source buffer is this buffer")

        val srcPos = src.position()
        val srcLim = src.limit()
        val srcRem = if (srcPos <= srcLim) srcLim - srcPos else 0
        val pos = position()
        val lim = limit()
        val rem = if (pos <= lim) lim - pos else 0

        if (srcRem > rem) throw BufferOverflowException()

        putBuffer(pos, src, srcPos, srcRem)

        position(pos + srcRem)
        src.position(srcPos + srcRem)

        return this
    }

    fun putBuffer(pos: Int, src: CharBuffer, srcPos: Int, n: Int) {
        if (readOnly) {
            throw ReadOnlyException()
        }
        val posMax = pos + n
        var i = pos
        var j = srcPos
        while (i < posMax) {
            put(i++, src[j++])
        }
    }

    override val length: Int
        get() = remaining()

    override fun subSequence(startIndex: Int, endIndex: Int): CharBuffer {
        return CharBuffer(
            bufferArray,
            position = bufferPosition + startIndex,
            offset = bufferOffset,
            limit = bufferPosition + endIndex,
            readOnly = readOnly
        )
    }

    override fun append(value: Char): CharBuffer {
        if (readOnly) {
            throw ReadOnlyException()
        }
        return this.put(value)
    }

    override fun append(value: CharSequence?): CharBuffer {
        if (readOnly) {
            throw ReadOnlyException()
        }
        return if (value == null) {
            this.put("null")
        } else if (value is StringBuilder) {
            this.appendChars(value)
        } else if (value is CharBuffer) {
            this.put(value)
        } else {
            this.put(value.toString())
        }
    }

    override fun append(value: CharSequence?, startIndex: Int, endIndex: Int): CharBuffer {
        if (readOnly) {
            throw ReadOnlyException()
        }
        /*if (csq instanceof String || csq instanceof StringBuffer ||
            csq instanceof StringBuilder)
            return appendChars(csq, start, end);*/
        if (value is String || value is StringBuilder) {
            return appendChars(value, startIndex, endIndex)
        } else if (value is CharBuffer) {

            // The append method throws BufferOverflowException when
            // there is insufficient space in the buffer
            val length = endIndex - startIndex
            val pos = position()
            val lim = limit()
            val rem = if (pos <= lim) lim - pos else 0

            if (length > rem) throw BufferOverflowException()

            putBuffer(pos, value, startIndex, length)
            position(pos + length)
            return this
        }

        val cs: CharSequence = value ?: "null"
        return this.put(cs.subSequence(startIndex, endIndex).toString())
    }

    private fun appendChars(csq: CharSequence, start: Int = 0, end: Int = csq.length): CharBuffer {
        if (readOnly) {
            throw ReadOnlyException()
        }
        val length = end - start
        val pos: Int = position()
        val lim: Int = limit()
        val rem = if (pos <= lim) lim - pos else 0
        if (length > rem) throw BufferOverflowException()

        if (csq is String) {
            csq.toCharArray(startIndex = start, endIndex = end).copyInto(destination = bufferArray, destinationOffset = ix(pos))
        } else if (csq is StringBuilder) {
            csq.toCharArray(destination = bufferArray, destinationOffset = ix(pos), startIndex = start, endIndex = end)
        } else {
            csq.substring(start, end).toCharArray().copyInto(destination = bufferArray, destinationOffset = ix(pos))
        }

        position(pos + length)

        return this
    }

    override fun position(newPosition: Int): CharBuffer {
        super.position(newPosition)
        return this
    }

    override fun asReadOnlyBuffer(): Buffer<CharArray> {
        return CharBuffer(
            charArray = bufferArray,
            position = bufferPosition,
            offset = bufferOffset,
            limit = bufferLimit,
            readOnly = true,
            mark = markValue()
        )
    }

    override fun flip(): CharBuffer {
        super.flip()
        return this
    }

    fun duplicate(): CharBuffer {
        return CharBuffer(
            charArray = bufferArray,
            position = bufferPosition,
            offset = bufferOffset,
            limit = bufferLimit,
            readOnly = readOnly,
            mark = markValue()
        )
    }

    override fun clear(): CharBuffer {
        super.clear()
        return this
    }

    override fun toString(): String {
        return bufferArray.concatToString(position(), limit())
    }

    fun slice(): CharBuffer {
        val pos = this.position();
        val lim = this.limit();
        val rem = (if (pos <= lim) lim - pos else 0);
        return CharBuffer(array(), mark = -1, position = 0, limit = rem, capacity = rem, offset = pos + bufferOffset);
    }

    companion object {
        fun wrap(str: String): CharBuffer {
            // fixme: Create StringCharBuffer like jdk to avoid extra CharArray conversion
            return wrap(str.toCharArray())
        }

        fun wrap(array: CharArray, offset: Int = 0, length: Int = array.size): CharBuffer = CharBuffer(
            charArray = array, position = offset, offset = 0, limit = offset + length
        )

        fun allocate(capacity: Int): CharBuffer {
            // todo: test it
            require(capacity >= 0) { "capacity must be >= 0" }
            return CharBuffer(charArray = CharArray(capacity), position = 0, offset = 0, limit = capacity)
        }
    }
}