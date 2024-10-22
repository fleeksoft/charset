@file:OptIn(InternalCharsetApi::class)

package com.fleeksoft.charset

import com.fleeksoft.charset.annotation.InternalCharsetApi
import com.fleeksoft.charset.cs.StandardCharsets
import com.fleeksoft.charset.spi.CharsetProviderRegistry

object Charsets {

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