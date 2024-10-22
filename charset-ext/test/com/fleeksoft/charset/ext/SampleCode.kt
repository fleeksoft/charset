package com.fleeksoft.charset.ext

import com.fleeksoft.charset.Charset
import com.fleeksoft.charset.Charsets
import com.fleeksoft.charset.cs.utf.UTF_8
import com.fleeksoft.charset.decodeToString
import com.fleeksoft.charset.io.ByteBuffer
import com.fleeksoft.charset.io.ByteBufferFactory
import com.fleeksoft.charset.io.CharBuffer
import com.fleeksoft.charset.io.CharBufferFactory
import com.fleeksoft.charset.toByteArray

class SampleCode {
    fun sample() {
        val inputString = "Hello, World!"

        // Encoding
        val charset: Charset = UTF_8.INSTANCE // or Charsets.forName("utf-8")

        val encodedBytes: ByteArray = inputString.toByteArray(charset) //ext fun from com.fleeksoft.charset.toByteArray
        println("Encoded Bytes: ${encodedBytes.joinToString()}")

        // Decoding
        val decodedString: String = encodedBytes.decodeToString(charset) // ext from com.fleeksoft.charset.decodeToString
        println("Decoded String: $decodedString")

        // Encoding a String to ByteArray
        val byteArray: ByteBuffer = Charsets.forName("UTF-8").encode("Hello, World!")

        // Decoding ByteArray to String
        val decodedCharBuffer: CharBuffer = Charsets.forName("UTF-8").decode(byteArray)

        // Creating a new Encoder
        val encoder = Charsets.forName("UTF-8").newEncoder()
        val encodedByteBuffer = encoder.encode(CharBufferFactory.wrap(inputString))

        // Creating a new Decoder
        val decoder = Charsets.forName("UTF-8").newDecoder()
        val decodedCharBuffer1: CharBuffer = decoder.decode(ByteBufferFactory.wrap(encodedBytes))

        val charArray = CharArray(5)
        val charBuffer: CharBuffer = CharBufferFactory.wrap(charArray)
        decoder.decode(ByteBufferFactory.wrap(encodedBytes), charBuffer, true)
    }
}