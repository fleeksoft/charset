package com.fleeksoft.charset.io

expect object ByteBufferFactory {
    fun wrap(byteArray: ByteArray, offset: Int = 0, length: Int = byteArray.size): ByteBuffer
    fun allocate(capacity: Int): ByteBuffer
}