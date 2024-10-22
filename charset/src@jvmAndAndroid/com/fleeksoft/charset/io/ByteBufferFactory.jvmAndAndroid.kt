package com.fleeksoft.charset.io

actual object ByteBufferFactory {
    actual fun wrap(byteArray: ByteArray, offset: Int, length: Int): ByteBuffer {
        return ByteBuffer.wrap(byteArray, offset, length)
    }

    actual fun allocate(capacity: Int): ByteBuffer {
        return ByteBuffer.allocate(capacity)
    }
}