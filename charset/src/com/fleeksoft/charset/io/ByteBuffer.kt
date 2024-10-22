package com.fleeksoft.charset.io

expect abstract class ByteBuffer : Buffer, Comparable<ByteBuffer> {
    abstract override fun slice(): ByteBuffer
    abstract override fun slice(index: Int, length: Int): ByteBuffer
    abstract override fun duplicate(): ByteBuffer
    abstract fun asReadOnlyBuffer(): ByteBuffer

    abstract fun get(): Byte
    abstract fun get(index: Int): Byte
    fun get(dst: ByteArray): ByteBuffer
    fun get(index: Int, dst: ByteArray): ByteBuffer
    open fun get(dst: ByteArray, offset: Int, length: Int): ByteBuffer
    open fun get(index: Int, dst: ByteArray, offset: Int, length: Int): ByteBuffer

    abstract fun put(b: Byte): ByteBuffer
    abstract fun put(index: Int, b: Byte): ByteBuffer
    fun put(src: ByteArray): ByteBuffer
    fun put(index: Int, src: ByteArray): ByteBuffer
    open fun put(src: ByteArray, offset: Int, length: Int): ByteBuffer
    open fun put(index: Int, src: ByteArray, offset: Int, length: Int): ByteBuffer
    fun put(src: ByteBuffer): ByteBuffer
    fun put(index: Int, src: ByteBuffer, offset: Int, length: Int): ByteBuffer

    final override fun array(): ByteArray
    final override fun arrayOffset(): Int
    override fun position(pos: Int): ByteBuffer
    override fun limit(newLimit: Int): ByteBuffer
    override fun mark(): ByteBuffer
    override fun reset(): ByteBuffer
    override fun clear(): ByteBuffer
    override fun flip(): ByteBuffer
    override fun rewind(): ByteBuffer
    abstract fun compact(): ByteBuffer

    override fun compareTo(other: ByteBuffer): Int
}


fun ByteBuffer.getAvailableArray(): ByteArray {
    val pos = position()
    val arr = array().copyOfRange(pos + arrayOffset(), limit())
    position(pos + arr.size)
    return arr
}

fun ByteBuffer.getInt(): Int = get().toInt()