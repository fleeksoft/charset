package com.fleeksoft.charset.io

actual object CharBufferFactory {
    actual fun wrap(charArray: CharArray, offset: Int, length: Int): CharBuffer {
        return HeapCharBuffer(charArray = charArray, position = offset, offset = 0, limit = offset + length)
    }

    actual fun wrap(charSequence: CharSequence, offset: Int, length: Int): CharBuffer {
        // FIXME: Create StringCharBuffer like jdk to avoid extra CharArray conversion
        return wrap(charSequence.toString().toCharArray(), offset, length)
    }

    actual fun allocate(capacity: Int): CharBuffer {
        require(capacity >= 0) { "capacity must be >= 0" }
        return HeapCharBuffer(charArray = CharArray(capacity), position = 0, offset = 0, limit = capacity)
    }
}

fun test() {

}