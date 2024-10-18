package com.fleeksoft.charset.cs

import com.fleeksoft.charset.Charset
import com.fleeksoft.charset.spi.CharsetProvider
import com.fleeksoft.charset.cs.ibm.*
import com.fleeksoft.charset.cs.iso.*
import com.fleeksoft.charset.cs.ms.*
import com.fleeksoft.charset.cs.utf.*

class StandardCharsets : CharsetProvider() {
    // FIXME: synchronized call for this function
    override fun charsetForName(charsetName: String): Charset? {
        return lookup(charsetName)
    }

    private fun lookup(charsetName: String): Charset? {
        // By checking these built-ins we can avoid initializing Aliases,
        // Classes and Cache eagerly during bootstrap.
        //
        // Initialization of java.nio.charset.StandardCharsets should be
        // avoided here to minimize time spent in System.initPhase1, as it
        // may delay initialization of performance critical VM subsystems.
        if (charsetName == "utf8") {
            return UTF_8.INSTANCE
        } else if (charsetName == "utf16") {
            return UTF_16.INSTANCE
        } else if (charsetName == "usascii" || charsetName == "ascii") {
            return US_ASCII.INSTANCE
        } else if (charsetName == "iso88591") {
            return ISO_8859_1.INSTANCE
        }

        // Check cache first
        return getCharsetByName(charsetName)
    }

    private val charsetMap: Map<String, () -> Charset> by lazy {
        mapOf(
            // UTF and Unicode
            "utf8" to { UTF_8.INSTANCE },
            "unicode11utf8" to { UTF_8.INSTANCE },
            "unicodebig" to { UTF_16.INSTANCE },
            "unicode" to { UTF_16.INSTANCE },
            "utf16" to { UTF_16.INSTANCE },
            "utf16le" to { UTF_16LE.INSTANCE },
            "xutf16le" to { UTF_16LE.INSTANCE },
            "unicodelittleunmarked" to { UTF_16LE.INSTANCE },
            "utf16be" to { UTF_16BE.INSTANCE },
            "xutf16be" to { UTF_16BE.INSTANCE },
            "unicodebigunmarked" to { UTF_16BE.INSTANCE },
            "iso10646ucs2" to { UTF_16BE.INSTANCE },
            "xutf16lebom" to { UTF_16LE_BOM.INSTANCE },
            "unicodelittle" to { UTF_16LE_BOM.INSTANCE },
            "utf32" to { UTF_32.INSTANCE },
            "utf32le" to { UTF_32LE.INSTANCE },
            "xutf32le" to { UTF_32LE.INSTANCE },
            "utf32lebom" to { UTF_32LE_BOM.INSTANCE },
            "xutf32lebom" to { UTF_32LE_BOM.INSTANCE },
            "utf32be" to { UTF_32BE.INSTANCE },
            "xutf32be" to { UTF_32BE.INSTANCE },
            "utf32bebom" to { UTF_32BE_BOM.INSTANCE },
            "xutf32bebom" to { UTF_32BE_BOM.INSTANCE },

            // ISO 8859 series
            "csisolatin1" to { ISO_8859_1.INSTANCE },
            "88591" to { ISO_8859_1.INSTANCE },
            "ibm819" to { ISO_8859_1.INSTANCE },
            "819" to { ISO_8859_1.INSTANCE },
            "iso88591:1987" to { ISO_8859_1.INSTANCE },
            "iso88591" to { ISO_8859_1.INSTANCE },
            "latin1" to { ISO_8859_1.INSTANCE },
            "cp819" to { ISO_8859_1.INSTANCE },
            "l1" to { ISO_8859_1.INSTANCE },
            "isoir100" to { ISO_8859_1.INSTANCE },
            "csisolatin2" to { ISO_8859_2.INSTANCE },
            "912" to { ISO_8859_2.INSTANCE },
            "88592" to { ISO_8859_2.INSTANCE },
            "cp912" to { ISO_8859_2.INSTANCE },
            "ibm912" to { ISO_8859_2.INSTANCE },
            "latin2" to { ISO_8859_2.INSTANCE },
            "l2" to { ISO_8859_2.INSTANCE },
            "iso88592" to { ISO_8859_2.INSTANCE },
            "isoir101" to { ISO_8859_2.INSTANCE },
            "csisolatin4" to { ISO_8859_4.INSTANCE },
            "914" to { ISO_8859_4.INSTANCE },
            "88594" to { ISO_8859_4.INSTANCE },
            "cp914" to { ISO_8859_4.INSTANCE },
            "ibm914" to { ISO_8859_4.INSTANCE },
            "latin4" to { ISO_8859_4.INSTANCE },
            "l4" to { ISO_8859_4.INSTANCE },
            "iso88594" to { ISO_8859_4.INSTANCE },
            "iso88594:1988" to { ISO_8859_4.INSTANCE },
            "isoir110" to { ISO_8859_4.INSTANCE },
            "csisolatincyrillic" to { ISO_8859_5.INSTANCE },
            "915" to { ISO_8859_5.INSTANCE },
            "88595" to { ISO_8859_5.INSTANCE },
            "cp915" to { ISO_8859_5.INSTANCE },
            "ibm915" to { ISO_8859_5.INSTANCE },
            "iso88595" to { ISO_8859_5.INSTANCE },
            "iso88595:1988" to { ISO_8859_5.INSTANCE },
            "isoir144" to { ISO_8859_5.INSTANCE },
            "cyrillic" to { ISO_8859_5.INSTANCE },
            "iso88597:1987" to { ISO_8859_7.INSTANCE },
            "813" to { ISO_8859_7.INSTANCE },
            "ecma118" to { ISO_8859_7.INSTANCE },
            "greek" to { ISO_8859_7.INSTANCE },
            "greek8" to { ISO_8859_7.INSTANCE },
            "ibm813" to { ISO_8859_7.INSTANCE },
            "cp813" to { ISO_8859_7.INSTANCE },
            "88597" to { ISO_8859_7.INSTANCE },
            "iso88597" to { ISO_8859_7.INSTANCE },
            "isoir126" to { ISO_8859_7.INSTANCE },
            "elot928" to { ISO_8859_7.INSTANCE },
            "csisolatingreek" to { ISO_8859_7.INSTANCE },
            "suneugreek" to { ISO_8859_7.INSTANCE },
            "csisolatin5" to { ISO_8859_9.INSTANCE },
            "920" to { ISO_8859_9.INSTANCE },
            "88599" to { ISO_8859_9.INSTANCE },
            "cp920" to { ISO_8859_9.INSTANCE },
            "ibm920" to { ISO_8859_9.INSTANCE },
            "l5" to { ISO_8859_9.INSTANCE },
            "iso88599" to { ISO_8859_9.INSTANCE },
            "isoir148" to { ISO_8859_9.INSTANCE },
            "latin5" to { ISO_8859_9.INSTANCE },
            "iso885913" to { ISO_8859_13.INSTANCE },
            "885913" to { ISO_8859_13.INSTANCE },
            "csisolatin0" to { ISO_8859_15.INSTANCE },
            "csisolatin9" to { ISO_8859_15.INSTANCE },
            "923" to { ISO_8859_15.INSTANCE },
            "cp923" to { ISO_8859_15.INSTANCE },
            "ibm923" to { ISO_8859_15.INSTANCE },
            "latin0" to { ISO_8859_15.INSTANCE },
            "latin9" to { ISO_8859_15.INSTANCE },
            "iso885915" to { ISO_8859_15.INSTANCE },
            "iso885915fdis" to { ISO_8859_15.INSTANCE },
            "csiso885915" to { ISO_8859_15.INSTANCE },
            "l9" to { ISO_8859_15.INSTANCE },
            "8859_15" to { ISO_8859_15.INSTANCE },
            "latin10" to { ISO_8859_16.INSTANCE },
            "iso885916" to { ISO_8859_16.INSTANCE },
            "isoir226" to { ISO_8859_16.INSTANCE },
            "csiso885916" to { ISO_8859_16.INSTANCE },
            "iso885916:2001" to { ISO_8859_16.INSTANCE },
            "l10" to { ISO_8859_16.INSTANCE },

            // Windows code pages
            "windows1250" to { MS1250.INSTANCE },
            "ms1250" to { MS1250.INSTANCE },
            "cp1250" to { MS1250.INSTANCE },
            "cp5346" to { MS1250.INSTANCE },
            "ansi1251" to { MS1251.INSTANCE },
            "windows1251" to { MS1251.INSTANCE },
            "cp1251" to { MS1251.INSTANCE },
            "cp5347" to { MS1251.INSTANCE },
            "ibm1251" to { MS1251.INSTANCE },
            "ms1251" to { MS1251.INSTANCE },
            "ibm1252" to { MS1252.INSTANCE },
            "windows1252" to { MS1252.INSTANCE },
            "cp1252" to { MS1252.INSTANCE },
            "cp5348" to { MS1252.INSTANCE },
            "ms1252" to { MS1252.INSTANCE },
            "windows1253" to { MS1253.INSTANCE },
            "ms1253" to { MS1253.INSTANCE },
            "cp1253" to { MS1253.INSTANCE },
            "cp5349" to { MS1253.INSTANCE },
            "windows1254" to { MS1254.INSTANCE },
            "ms1254" to { MS1254.INSTANCE },
            "cp1254" to { MS1254.INSTANCE },
            "cp5350" to { MS1254.INSTANCE },
            "windows1257" to { MS1257.INSTANCE },
            "ms1257" to { MS1257.INSTANCE },
            "cp1257" to { MS1257.INSTANCE },
            "cp5353" to { MS1257.INSTANCE },

            // IBM code pages
            "cspc8codepage437" to { IBM437.INSTANCE },
            "437" to { IBM437.INSTANCE },
            "cp437" to { IBM437.INSTANCE },
            "ibm437" to { IBM437.INSTANCE },
            "windows437" to { IBM437.INSTANCE },
            "737" to { IBM737.INSTANCE },
            "ibm737" to { IBM737.INSTANCE },
            "xibm737" to { IBM737.INSTANCE },
            "cp737" to { IBM737.INSTANCE },
            "775" to { IBM775.INSTANCE },
            "ibm775" to { IBM775.INSTANCE },
            "cp775" to { IBM775.INSTANCE },
            "cspc850multilingual" to { IBM850.INSTANCE },
            "850" to { IBM850.INSTANCE },
            "ibm850" to { IBM850.INSTANCE },
            "cp850" to { IBM850.INSTANCE },
            "cspcp852" to { IBM852.INSTANCE },
            "852" to { IBM852.INSTANCE },
            "ibm852" to { IBM852.INSTANCE },
            "cp852" to { IBM852.INSTANCE },
            "cspcp855" to { IBM855.INSTANCE },
            "855" to { IBM855.INSTANCE },
            "ibm855" to { IBM855.INSTANCE },
            "cp855" to { IBM855.INSTANCE },
            "csibm857" to { IBM857.INSTANCE },
            "857" to { IBM857.INSTANCE },
            "ibm857" to { IBM857.INSTANCE },
            "cp857" to { IBM857.INSTANCE },
            "858" to { IBM858.INSTANCE },
            "ibm858" to { IBM858.INSTANCE },
            "cp858" to { IBM858.INSTANCE },
            "cp00858" to { IBM858.INSTANCE },
            "ccsid00858" to { IBM858.INSTANCE },
            "ibm00858" to { IBM858.INSTANCE },
            "pcmultilingual850+euro" to { IBM858.INSTANCE },
            "cspc862latinhebrew" to { IBM862.INSTANCE },
            "csibm862" to { IBM862.INSTANCE },
            "862" to { IBM862.INSTANCE },
            "ibm862" to { IBM862.INSTANCE },
            "cp862" to { IBM862.INSTANCE },
            "csibm866" to { IBM866.INSTANCE },
            "866" to { IBM866.INSTANCE },
            "ibm866" to { IBM866.INSTANCE },
            "cp866" to { IBM866.INSTANCE },
            "ibm874" to { IBM874.INSTANCE },
            "xibm874" to { IBM874.INSTANCE },
            "cp874" to { IBM874.INSTANCE },
            "874" to { IBM874.INSTANCE },

            // ASCII
            "ascii" to { US_ASCII.INSTANCE },
            "usascii" to { US_ASCII.INSTANCE },
            "ascii7" to { US_ASCII.INSTANCE },
            "us" to { US_ASCII.INSTANCE },
            "ibm367" to { US_ASCII.INSTANCE },
            "cp367" to { US_ASCII.INSTANCE },
            "iso646us" to { US_ASCII.INSTANCE },
            "csascii" to { US_ASCII.INSTANCE },
            "646" to { US_ASCII.INSTANCE },
            "ansix341986" to { US_ASCII.INSTANCE },
            "ansix3.41986" to { US_ASCII.INSTANCE },
            "ansix3.41968" to { US_ASCII.INSTANCE },
            "iso_646.irv:1983" to { US_ASCII.INSTANCE },
            "iso_646.irv:1991" to { US_ASCII.INSTANCE },
            "isoir6" to { US_ASCII.INSTANCE },
            "default" to { US_ASCII.INSTANCE },

            // Koi8
            "koi8r" to { KOI8_R.INSTANCE },
            "koi8" to { KOI8_R.INSTANCE },
            "cskoi8r" to { KOI8_R.INSTANCE },
            "koi8u" to { KOI8_U.INSTANCE },

            // other
            "cesu8" to { CESU_8.INSTANCE },
            "cscesu8" to { CESU_8.INSTANCE },
            "gb18030" to { GB18030.INSTANCE },
            "gb180302022" to { GB18030.INSTANCE },
            "gb180302000" to { GB18030.INSTANCE }
        )
    }

    fun getCharsetByName(name: String): Charset? {
        return charsetMap[name]?.invoke()
    }
}