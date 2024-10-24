package com.fleeksoft.charset.io

actual interface Readable {
    actual fun read(cb: CharBuffer): Int
}