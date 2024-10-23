@file:OptIn(InternalCharsetApi::class)

package com.fleeksoft.charset

import com.fleeksoft.charset.annotation.InternalCharsetApi
import com.fleeksoft.charset.internal.CharsetLookup

object Charsets {
    val UTF8 by lazy { forName("UTF-8") }
    fun normalizeCharsetName(name: String): String = name.replace("-", "").replace("_", "").lowercase()
    fun forName(name: String): Charset {
        return CharsetLookup.forName(name)
    }

    fun isSupported(charsetName: String): Boolean {
        return CharsetLookup.isSupported(charsetName)
    }
}