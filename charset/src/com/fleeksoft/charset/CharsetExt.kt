package com.fleeksoft.charset

import com.fleeksoft.charset.io.ByteBuffer

fun String.toByteArray(charset: Charset): ByteArray {
    val byteBuffer = charset.encode(this)
    return if (byteBuffer.limit() != byteBuffer.capacity) {
        byteBuffer.getAvailableArray()
    } else {
        byteBuffer.array()
    }
}

fun ByteArray.decodeToString(charset: Charset): String {
    val decode = charset.decode(ByteBuffer.wrap(this))
    return decode.toString()
}