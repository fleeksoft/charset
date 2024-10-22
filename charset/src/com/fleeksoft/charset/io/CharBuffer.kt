package com.fleeksoft.charset.io

expect abstract class CharBuffer : Buffer, Comparable<CharBuffer>, Appendable, Readable {
    abstract override fun slice(): CharBuffer
    abstract override fun slice(index: Int, length: Int): CharBuffer
    abstract override fun duplicate(): CharBuffer
    abstract fun asReadOnlyBuffer(): CharBuffer

    abstract fun get(): Char

    //    abstract fun get(index: Int): Char
    open fun get(dstCharArray: CharArray, offset: Int, length: Int): CharBuffer
    open fun get(index: Int, dstCharArray: CharArray, offset: Int, length: Int): CharBuffer
    fun get(dstCharArray: CharArray): CharBuffer
    fun get(index: Int, dstCharArray: CharArray): CharBuffer
    abstract fun put(c: Char): CharBuffer
    abstract fun put(index: Int, c: Char): CharBuffer
    open fun put(src: CharArray, offset: Int, length: Int): CharBuffer
    open fun put(index: Int, src: CharArray, offset: Int, length: Int): CharBuffer
    fun put(src: CharArray): CharBuffer
    fun put(index: Int, src: CharArray): CharBuffer
    open fun put(src: CharBuffer): CharBuffer
    open fun put(index: Int, src: CharBuffer, offset: Int, length: Int): CharBuffer
    fun put(src: String): CharBuffer
    open fun put(src: String, start: Int, end: Int): CharBuffer

    final override fun array(): CharArray
    final override fun arrayOffset(): Int
    final override fun position(pos: Int): CharBuffer
    final override fun limit(newLimit: Int): CharBuffer
    final override fun mark(): CharBuffer
    final override fun reset(): CharBuffer
    final override fun clear(): CharBuffer
    final override fun flip(): CharBuffer
    final override fun rewind(): CharBuffer

    abstract fun compact(): CharBuffer

    override fun toString(): String

    override fun compareTo(other: CharBuffer): Int
    override fun read(cb: CharBuffer): Int
    override fun append(value: CharSequence?): CharBuffer
    override fun append(value: CharSequence?, startIndex: Int, endIndex: Int): CharBuffer
    override fun append(value: Char): CharBuffer
}


expect operator fun CharBuffer.get(index: Int): Char