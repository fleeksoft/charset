package com.fleeksoft.charset.io

actual object CharBufferFactory {
    actual fun wrap(
        charArray: CharArray,
        offset: Int,
        length: Int
    ): CharBuffer {
        return java.nio.CharBuffer.wrap(charArray, offset, length)
    }

    actual fun wrap(
        charSequence: CharSequence,
        offset: Int,
        length: Int
    ): CharBuffer {
        return java.nio.CharBuffer.wrap(charSequence, offset, length)
    }

    actual fun allocate(capacity: Int): CharBuffer {
        return java.nio.CharBuffer.allocate(capacity)
    }
}