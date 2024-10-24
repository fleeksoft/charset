package com.fleeksoft.charset.io

actual object ByteBufferFactory {
    actual fun wrap(
        byteArray: ByteArray,
        offset: Int,
        length: Int
    ): ByteBuffer {
        return HeapByteBuffer(
            byteArray = byteArray,
            mark = -1,
            position = offset,
            limit = offset + length,
            offset = 0
        )
    }

    actual fun allocate(capacity: Int): ByteBuffer {
        return HeapByteBuffer(
            byteArray = ByteArray(capacity),
            mark = -1,
            position = 0,
            limit = capacity,
            offset = 0
        )
    }
}