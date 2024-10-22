package com.fleeksoft.charset.io

actual abstract class Buffer(
    protected var bufferPosition: Int = 0,
    protected var bufferLimit: Int,
    val cap: Int,
    protected var bufferMark: Int = -1
) {

    init {
        if (bufferMark >= 0 && bufferMark > bufferPosition) {
            throw IllegalArgumentException("mark > position: ($bufferMark > $bufferPosition)")
        }
    }

    actual fun remaining(): Int {
        val rem = bufferLimit - bufferPosition
        return if (rem > 0) rem else 0
    }

    actual fun capacity(): Int = cap
    actual fun limit(): Int = bufferLimit
    actual open fun limit(newLimit: Int): Buffer {
        if (newLimit > cap || newLimit < 0) {
            throw Exception("Invalid newLimit: $newLimit")
        }
        bufferLimit = newLimit
        if (bufferPosition > newLimit) bufferPosition = newLimit
        if (bufferMark > newLimit) bufferMark = -1
        return this
    }

    actual abstract fun isReadOnly(): Boolean

    actual fun position(): Int = bufferPosition
    actual open fun position(pos: Int): Buffer {
        if (bufferMark > pos) bufferMark = -1
        bufferPosition = pos
        return this
    }

    actual open fun flip(): Buffer {
        bufferLimit = bufferPosition
        bufferPosition = 0
        bufferMark = -1
        return this
    }

    actual open fun clear(): Buffer {
        bufferPosition = 0
        bufferLimit = cap
        bufferMark = -1
        return this
    }

    actual fun hasRemaining(): Boolean = bufferPosition < bufferLimit
    actual open fun mark(): Buffer {
        bufferMark = bufferPosition
        return this
    }

    fun discardMark() {
        bufferMark = -1
    }

    actual open fun reset(): Buffer {
        val m = bufferMark
        require(bufferMark >= 0) { "mark < 0" }
        bufferPosition = m
        return this
    }

    actual open fun rewind(): Buffer {
        bufferPosition = 0
        bufferMark = -1
        return this
    }

    actual abstract fun arrayOffset(): Int
    actual abstract fun array(): Any
    actual abstract fun slice(): Buffer
    actual abstract fun slice(index: Int, length: Int): Buffer
    actual abstract fun duplicate(): Buffer

    protected fun nextPutIndex(): Int {
        val p = bufferPosition
        if (p >= bufferLimit) throw BufferOverflowException();
        bufferPosition = p + 1
        return p
    }

    protected fun nextGetIndex(): Int {
        val p = bufferPosition
        if (p >= bufferLimit) throw BufferUnderflowException();
        bufferPosition = p + 1
        return p
    }

    protected fun checkIndex(index: Int): Int {
        if (index < 0 || index >= bufferLimit) throw Exception("Invalid index: $index")
        return index
    }

    protected fun checkIndex(index: Int, nb: Int): Int {
        val length = bufferLimit - nb + 1
        if (index < 0 || index >= length)
            throw IndexOutOfBoundsException()

        return index;
    }


    protected fun checkFromIndexSize(fromIndex: Int, size: Int, destSize: Int): Int {
        if ((destSize or fromIndex or size) < 0 || size > destSize - fromIndex) {
            throw BufferUnderflowException()
        }

        return fromIndex
    }

    protected fun checkFromToIndex(fromIndex: Int, toIndex: Int, length: Int): Int {
        if (fromIndex < 0 || fromIndex > toIndex || toIndex > length)
            throw IndexOutOfBoundsException()
        return fromIndex
    }
}