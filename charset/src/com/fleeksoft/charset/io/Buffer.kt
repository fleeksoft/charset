package com.fleeksoft.charset.io

abstract class Buffer<T>(
    protected val bufferArray: T,
    protected var bufferPosition: Int = 0,
    protected var bufferOffset: Int,
    protected var bufferLimit: Int,
    val capacity: Int,
    protected var bufferMark: Int = -1,
    val readOnly: Boolean
) {
    init {
        if (bufferMark >= 0 && bufferMark > bufferPosition) {
            throw IllegalArgumentException("mark > position: ($bufferMark > $bufferPosition)")
        }
    }

    fun hasRemaining(): Boolean = bufferPosition < bufferLimit

    fun remaining(): Int {
        val rem = bufferLimit - bufferPosition
        return if (rem > 0) rem else 0
    }

    open fun flip(): Buffer<T> {
        bufferLimit = bufferPosition
        bufferPosition = 0
        bufferMark = -1
        return this
    }

    open fun position(newPosition: Int): Buffer<T> {
        if (bufferMark > newPosition) bufferMark = -1
        bufferPosition = newPosition
        return this
    }

    fun position(): Int = bufferPosition
    fun array(): T = bufferArray
    fun arrayOffset(): Int = bufferOffset
    fun limit(): Int = bufferLimit

    fun limit(newLimit: Int): Buffer<T> {
        if (newLimit > capacity || newLimit < 0) {
            throw Exception("Invalid newLimit: $newLimit")
        }
        bufferLimit = newLimit
        if (bufferPosition > newLimit) bufferPosition = newLimit
        if (bufferMark > newLimit) bufferMark = -1
        return this
    }

    protected fun ix(i: Int): Int {
        return i + bufferOffset
    }

    open fun clear(): Buffer<T> {
        bufferPosition = 0
        bufferLimit = capacity
        bufferMark = -1
        return this
    }

    abstract fun asReadOnlyBuffer(): Buffer<T>


    fun mark(): Buffer<T> {
        bufferMark = bufferPosition
        return this
    }

    fun discardMark() {
        bufferMark = -1
    }

    fun markValue() = bufferMark

    fun reset(): Buffer<T> {
        val m = bufferMark
        require(bufferMark >= 0) { "mark < 0" }
        bufferPosition = m
        return this
    }

    fun rewind(): Buffer<T> {
        bufferPosition = 0
        bufferMark = -1
        return this
    }

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

    fun checkIndex(index: Int): Int {
        if (index < 0 || index >= bufferLimit) throw Exception("Invalid index: $index")
        return index
    }

    fun checkFromIndexSize(fromIndex: Int, size: Int, destSize: Int): Int {
        if ((destSize or fromIndex or size) < 0 || size > destSize - fromIndex) {
            throw BufferUnderflowException()
        }

        return fromIndex
    }
}