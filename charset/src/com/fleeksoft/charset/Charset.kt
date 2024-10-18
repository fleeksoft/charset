@file:OptIn(InternalCharsetApi::class)

package com.fleeksoft.charset

import com.fleeksoft.charset.annotation.InternalCharsetApi
import com.fleeksoft.charset.cs.StandardCharsets
import com.fleeksoft.charset.cs.ThreadLocalCoders
import com.fleeksoft.charset.io.ByteBuffer
import com.fleeksoft.charset.io.CharBuffer
import com.fleeksoft.charset.spi.CharsetProviderRegistry

abstract class Charset(val name: String) : Comparable<Charset> {
    abstract fun newDecoder(): CharsetDecoder
    abstract fun newEncoder(): CharsetEncoder

    fun decode(bb: ByteBuffer): CharBuffer {
        return ThreadLocalCoders.decoderFor(this)
            .onMalformedInput(CodingErrorAction.REPLACE)
            .onUnmappableCharacter(CodingErrorAction.REPLACE)
            .decode(bb)
    }

    fun encode(cb: CharBuffer): ByteBuffer {
        return ThreadLocalCoders.encoderFor(this)
            .onMalformedInput(CodingErrorAction.REPLACE)
            .onUnmappableCharacter(CodingErrorAction.REPLACE)
            .encode(cb)
    }

    fun encode(str: String): ByteBuffer {
        return encode(CharBuffer.wrap(str))
    }

    open fun canEncode(): Boolean = true


    override fun compareTo(other: Charset): Int {
        return name.compareTo(other.name, ignoreCase = true)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        return other is Charset && name == other.name
    }

    override fun toString(): String {
        return name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }


    companion object {
        fun forName(name: String): Charset {
            return lookup(normalizeCharsetName(name)) ?: throw Exception("Unknown charset: $name")
        }

        fun normalizeCharsetName(name: String): String = name.replace("-", "").replace("_", "").lowercase()

        fun isSupported(charsetName: String): Boolean {
            return (lookup(normalizeCharsetName(charsetName)) != null)
        }

        private val standardProvider = StandardCharsets()

        private var cache1: ArrayList<Any> = arrayListOf() // level 1 cache
        private var cache2: ArrayList<Any> = arrayListOf() // level 2 cache

        private fun cache(charsetName: String, cs: Charset) {
            cache2 = cache1
            cache1 = arrayListOf(charsetName, cs)
        }

        private fun lookup(charsetName: String): Charset? {
            if (cache1.isNotEmpty() && charsetName == cache1[0]) return cache1[1] as Charset
            // We expect most programs to use one Charset repeatedly.
            // We convey a hint to this effect to the VM by putting the
            // level 1 cache miss code in a separate method.
            return lookup2(charsetName)
        }

        private fun lookup2(charsetName: String): Charset? {
            if (cache2.isNotEmpty() && charsetName == cache2[0]) {
                val a = cache2
                cache2 = cache1
                cache1 = a
                return a[1] as Charset
            }
            var cs: Charset?
            if ((standardProvider.charsetForName(charsetName).also { cs = it }) != null) {
                cache(charsetName, cs!!)
                return cs
            }

            CharsetProviderRegistry.providers.forEach { provider ->
                if ((provider.factory.charsetForName(charsetName).also { cs = it }) != null) {
                    cache(charsetName, cs!!)
                    return cs
                }
            }

            return null
        }
    }
}