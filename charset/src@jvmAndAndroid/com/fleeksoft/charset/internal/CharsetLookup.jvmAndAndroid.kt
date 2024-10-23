package com.fleeksoft.charset.internal

import com.fleeksoft.charset.Charset
import com.fleeksoft.charset.Charsets

internal actual object CharsetLookup {

    actual fun forName(charsetName: String): Charset {
        val normalizedKey = Charsets.normalizeCharsetName(charsetName)
        val charsetKey =
            CharsetNameMapping.standardCharsetMapKeys[normalizedKey] ?: CharsetNameMapping.extendedCharsetMapKeys[normalizedKey]
            ?: charsetName
        return java.nio.charset.Charset.forName(charsetKey)
    }

    actual fun isSupported(charsetName: String): Boolean {
        val normalizedKey = Charsets.normalizeCharsetName(charsetName)
        val charsetKey =
            CharsetNameMapping.standardCharsetMapKeys[normalizedKey] ?: CharsetNameMapping.extendedCharsetMapKeys[normalizedKey]
            ?: charsetName
        return java.nio.charset.Charset.isSupported(charsetName)
    }
}