package com.fleeksoft.charset.io

expect interface Readable {
    fun read(cb: CharBuffer): Int
}