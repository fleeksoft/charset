package com.fleeksoft.charset

import com.fleeksoft.charset.io.ByteBufferFactory
import com.fleeksoft.charset.io.getAvailableArray

fun String.toByteArray(charset: Charset): ByteArray {
    val byteBuffer = charset.encode(this)
    return if (byteBuffer.limit() != byteBuffer.capacity()) {
        byteBuffer.getAvailableArray()
    } else {
        byteBuffer.array()
    }
}

fun ByteArray.decodeToString(charset: Charset): String {
    val decode = charset.decode(ByteBufferFactory.wrap(this))
    return decode.toString()
}