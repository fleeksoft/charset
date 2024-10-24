package com.fleeksoft.charset.io

expect object CharBufferFactory {
    fun wrap(charArray: CharArray, offset: Int = 0, length: Int = charArray.size): CharBuffer
    fun wrap(charSequence: CharSequence, offset: Int = 0, length: Int = charSequence.length): CharBuffer
    fun allocate(capacity: Int): CharBuffer
}