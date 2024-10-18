package com.fleeksoft.charset

import java.nio.ByteBuffer
import java.nio.CharBuffer
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import kotlin.test.Test

class CharsetJvmTest {

    @Test
    fun test() {
        val eucKrText = "<body>한국어</body>"
        val eucKrBytes = eucKrText.toByteArray(Charset.forName("euc-kr"))
        val charArray = CharArray(eucKrText.length)
        val charset = Charset.forName("GB2312")
        println(charset)

        val jCodeResult =
            Charset.forName("euc-kr").newDecoder().decode(ByteBuffer.wrap(eucKrBytes), CharBuffer.wrap(charArray), true)
        println("jCodeResult: $jCodeResult")

        charArray.fill('0')
        StandardCharsets.UTF_8.aliases()

        val codeResult = Charset.forName("euc-kr").newDecoder()
            .decode(
                ByteBuffer.wrap(eucKrBytes),
                CharBuffer.wrap(charArray),
                true
            )

        println("jCodeResult: $codeResult")
//        assertEquals(4, decodedBytesCount)
//        assertEquals("He", out.toString())
    }
}