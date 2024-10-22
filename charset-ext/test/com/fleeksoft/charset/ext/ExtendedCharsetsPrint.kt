package com.fleeksoft.charset.ext

import com.fleeksoft.charset.Charsets
import kotlin.test.Test

class ExtendedCharsetsPrint {
    fun charset(name: String, className: String, aliases: Array<String>) {
        val normalizedAliases = aliases.map { Charsets.normalizeCharsetName(it) }.toMutableSet()
        normalizedAliases.add(Charsets.normalizeCharsetName(name))

//        println("${normalizedAliases.joinToString(", ") { "\"$it\"" }} -> { ${className}() }")
        /*normalizedAliases.forEach { alias ->
            println("\"${alias}\" to \"$className\",")
        }*/

        println("\"${className}\" to { $className() },")
    }

    fun printCharsets() {
        charset(
            "Big5", "Big5",
            arrayOf<String>(
                "csBig5",
            )
        )

        charset(
            "x-MS950-HKSCS-XP", "MS950_HKSCS_XP",
            arrayOf<String>(
                "MS950_HKSCS_XP",
            )
        )

        charset(
            "x-MS950-HKSCS", "MS950_HKSCS",
            arrayOf<String>(
                "MS950_HKSCS",
            )
        )

        charset(
            "x-windows-950", "MS950",
            arrayOf<String>(
                "ms950",
                "windows-950",
            )
        )

        charset(
            "x-windows-874", "MS874",
            arrayOf<String>(
                "ms874",
                "ms-874",
                "windows-874",
            )
        )

        charset(
            "x-EUC-TW", "EUC_TW",
            arrayOf<String>(
                "euc_tw",
                "euctw",
                "cns11643",
                "EUC-TW",
            )
        )

        charset(
            "Big5-HKSCS", "Big5_HKSCS",
            arrayOf<String>(
                "Big5_HKSCS",
                "big5hk",
                "big5-hkscs",
                "big5hkscs",
            )
        )

        charset(
            "x-Big5-HKSCS-2001", "Big5_HKSCS_2001",
            arrayOf<String>(
                "Big5_HKSCS_2001",
                "big5hk-2001",
                "big5-hkscs-2001",
                "big5-hkscs:unicode3.0",
                "big5hkscs-2001",
            )
        )

        charset(
            "x-Big5-Solaris", "Big5_Solaris",
            arrayOf<String>(
                "Big5_Solaris",
            )
        )

        charset(
            "GBK", "GBK",
            arrayOf<String>(
                "windows-936",
                "CP936",
            )
        )

        charset(
            "GB2312", "EUC_CN",
            arrayOf<String>(
                "gb2312",
                "gb2312-80",
                "gb2312-1980",
                "euc-cn",
                "euccn",
                "x-EUC-CN",
                "EUC_CN",
            )
        )

        charset(
            "x-mswin-936", "MS936",
            arrayOf<String>(
                "ms936",
                "ms_936",
            )
        )

        charset(
            "Shift_JIS", "SJIS",
            arrayOf<String>(
                "sjis",
                "shift_jis",
                "shift-jis",
                "ms_kanji",
                "x-sjis",
                "csShiftJIS",
            )
        )

        charset(
            "windows-31j", "MS932",
            arrayOf<String>(
                "MS932",
                "windows-932",
                "csWindows31J",
            )
        )

        charset(
            "JIS_X0201", "JIS_X_0201",
            arrayOf<String>(
                "JIS0201",
                "JIS_X0201",
                "X0201",
                "csHalfWidthKatakana",
            )
        )

        charset(
            "x-JIS0208", "JIS_X_0208",
            arrayOf<String>(
                "JIS0208",
                "JIS_C6226-1983",
                "iso-ir-87",
                "x0208",
                "JIS_X0208-1983",
                "csISO87JISX0208",
            )
        )

        charset(
            "JIS_X0212-1990", "JIS_X_0212",
            arrayOf<String>(
                "JIS0212",
                "jis_x0212-1990",
                "x0212",
                "iso-ir-159",
                "csISO159JISX02121990",
            )
        )

        charset(
            "x-SJIS_0213", "SJIS_0213",
            arrayOf<String>(
                "sjis-0213",
                "sjis_0213",
                "sjis:2004",
                "sjis_0213:2004",
                "shift_jis_0213:2004",
                "shift_jis:2004",
            )
        )

        charset(
            "x-MS932_0213", "MS932_0213",
            arrayOf<String>(
                "MS932-0213",
                "MS932_0213",
                "MS932:2004",
                "windows-932-0213",
                "windows-932:2004",
            )
        )

        charset(
            "EUC-JP", "EUC_JP",
            arrayOf<String>(
                "euc_jp",
                "eucjis",
                "eucjp",
                "Extended_UNIX_Code_Packed_Format_for_Japanese",
                "csEUCPkdFmtjapanese",
                "x-euc-jp",
                "x-eucjp",
            )
        )

        charset(
            "x-euc-jp-linux", "EUC_JP_LINUX",
            arrayOf<String>(
                "euc_jp_linux",
                "euc-jp-linux",
            )
        )

        charset(
            "x-eucJP-Open", "EUC_JP_Open",
            arrayOf<String>(
                "EUC_JP_Solaris",
                "eucJP-open",
            )
        )

        charset(
            "x-PCK", "PCK",
            arrayOf<String>(
                "pck",
            )
        )

        charset(
            "ISO-2022-JP", "ISO2022_JP",
            arrayOf<String>(
                "iso2022jp",
                "jis",
                "csISO2022JP",
                "jis_encoding",
                "csjisencoding",
            )
        )

        charset(
            "ISO-2022-JP-2", "ISO2022_JP_2",
            arrayOf<String>(
                "csISO2022JP2",
                "iso2022jp2",
            )
        )

        charset(
            "x-windows-50221", "MS50221",
            arrayOf<String>(
                "ms50221",
                "cp50221",
            )
        )

        charset(
            "x-windows-50220", "MS50220",
            arrayOf<String>(
                "ms50220",
                "cp50220",
            )
        )

        charset(
            "x-windows-iso2022jp", "MSISO2022JP",
            arrayOf<String>(
                "windows-iso2022jp",
            )
        )

        charset(
            "x-JISAutoDetect", "JISAutoDetect",
            arrayOf<String>(
                "JISAutoDetect",
            )
        )

        charset(
            "EUC-KR", "EUC_KR",
            arrayOf<String>(
                "euc_kr",
                "ksc5601",
                "euckr",
                "ks_c_5601-1987",
                "ksc5601-1987",
                "ksc5601_1987",
                "ksc_5601",
                "csEUCKR",
                "5601",
            )
        )

        charset(
            "x-windows-949", "MS949",
            arrayOf<String>(
                "ms949",
                "windows949",
                "windows-949",
                "ms_949",
            )
        )

        charset(
            "x-Johab", "Johab",
            arrayOf<String>(
                "ksc5601-1992",
                "ksc5601_1992",
                "ms1361",
                "johab",
            )
        )

        charset(
            "ISO-2022-KR", "ISO2022_KR",
            arrayOf<String>(
                "ISO2022KR",
                "csISO2022KR",
            )
        )

        charset(
            "ISO-2022-CN", "ISO2022_CN",
            arrayOf<String>(
                "ISO2022CN",
                "csISO2022CN",
            )
        )

        charset(
            "x-ISO-2022-CN-CNS", "ISO2022_CN_CNS",
            arrayOf<String>(
                "ISO2022CN_CNS",
                "ISO-2022-CN-CNS",
            )
        )

        charset(
            "x-ISO-2022-CN-GB", "ISO2022_CN_GB",
            arrayOf<String>(
                "ISO2022CN_GB",
                "ISO-2022-CN-GB",
            )
        )

        charset(
            "x-ISCII91", "ISCII91",
            arrayOf<String>(
                "iscii",
                "ST_SEV_358-88",
                "iso-ir-153",
                "csISO153GOST1976874",
                "ISCII91",
            )
        )

        charset(
            "ISO-8859-3", "ISO_8859_3",
            arrayOf<String>(
                "iso8859_3",
                "8859_3",
                "ISO_8859-3:1988",
                "iso-ir-109",
                "ISO_8859-3",
                "ISO8859-3",
                "latin3",
                "l3",
                "ibm913",
                "ibm-913",
                "cp913",
                "913",
                "csISOLatin3",
            )
        )

        charset(
            "ISO-8859-6", "ISO_8859_6",
            arrayOf<String>(
                "iso8859_6",
                "8859_6",
                "iso-ir-127",
                "ISO_8859-6",
                "ISO_8859-6:1987",
                "ISO8859-6",
                "ECMA-114",
                "ASMO-708",
                "arabic",
                "ibm1089",
                "ibm-1089",
                "cp1089",
                "1089",
                "csISOLatinArabic",
            )
        )

        charset(
            "ISO-8859-8", "ISO_8859_8",
            arrayOf<String>(
                "iso8859_8",
                "8859_8",
                "iso-ir-138",
                "ISO_8859-8",
                "ISO_8859-8:1988",
                "ISO8859-8",
                "cp916",
                "916",
                "ibm916",
                "ibm-916",
                "hebrew",
                "csISOLatinHebrew",
            )
        )

        charset(
            "x-iso-8859-11", "ISO_8859_11",
            arrayOf<String>(
                "iso-8859-11",
                "iso8859_11",
            )
        )

        charset(
            "TIS-620", "TIS_620",
            arrayOf<String>(
                "tis620",
                "tis620.2533",
            )
        )

        charset(
            "windows-1255", "MS1255",
            arrayOf<String>(
                "cp1255",
            )
        )

        charset(
            "windows-1256", "MS1256",
            arrayOf<String>(
                "cp1256",
            )
        )

        charset(
            "windows-1258", "MS1258",
            arrayOf<String>(
                "cp1258",
            )
        )

        charset(
            "x-IBM942", "IBM942",
            arrayOf<String>(
                "cp942",
                "ibm942",
                "ibm-942",
                "942",
            )
        )

        charset(
            "x-IBM942C", "IBM942C",
            arrayOf<String>(
                "cp942C",
                "ibm942C",
                "ibm-942C",
                "942C",
                "cp932",
                "ibm932",
                "ibm-932",
                "932",
                "x-ibm932",
            )
        )

        charset(
            "x-IBM943", "IBM943",
            arrayOf<String>(
                "cp943",
                "ibm943",
                "ibm-943",
                "943",
            )
        )

        charset(
            "x-IBM943C", "IBM943C",
            arrayOf<String>(
                "cp943C",
                "ibm943C",
                "ibm-943C",
                "943C",
            )
        )

        charset(
            "x-IBM948", "IBM948",
            arrayOf<String>(
                "cp948",
                "ibm948",
                "ibm-948",
                "948",
            )
        )

        charset(
            "x-IBM950", "IBM950",
            arrayOf<String>(
                "cp950",
                "ibm950",
                "ibm-950",
                "950",
            )
        )

        charset(
            "x-IBM930", "IBM930",
            arrayOf<String>(
                "cp930",
                "ibm930",
                "ibm-930",
                "930",
            )
        )

        charset(
            "x-IBM935", "IBM935",
            arrayOf<String>(
                "cp935",
                "ibm935",
                "ibm-935",
                "935",
            )
        )

        charset(
            "x-IBM937", "IBM937",
            arrayOf<String>(
                "cp937",
                "ibm937",
                "ibm-937",
                "937",
            )
        )

        charset(
            "x-IBM856", "IBM856",
            arrayOf<String>(
                "cp856",
                "ibm-856",
                "ibm856",
                "856",
            )
        )

        charset(
            "IBM860", "IBM860",
            arrayOf<String>(
                "cp860",
                "ibm860",
                "ibm-860",
                "860",
                "csIBM860",
            )
        )

        charset(
            "IBM861", "IBM861",
            arrayOf<String>(
                "cp861",
                "ibm861",
                "ibm-861",
                "861",
                "csIBM861",
                "cp-is",
            )
        )

        charset(
            "IBM863", "IBM863",
            arrayOf<String>(
                "cp863",
                "ibm863",
                "ibm-863",
                "863",
                "csIBM863",
            )
        )

        charset(
            "IBM864", "IBM864",
            arrayOf<String>(
                "cp864",
                "ibm864",
                "ibm-864",
                "864",
                "csIBM864",
            )
        )

        charset(
            "IBM865", "IBM865",
            arrayOf<String>(
                "cp865",
                "ibm865",
                "ibm-865",
                "865",
                "csIBM865",
            )
        )

        charset(
            "IBM868", "IBM868",
            arrayOf<String>(
                "cp868",
                "ibm868",
                "ibm-868",
                "868",
                "cp-ar",
                "csIBM868",
            )
        )

        charset(
            "IBM869", "IBM869",
            arrayOf<String>(
                "cp869",
                "ibm869",
                "ibm-869",
                "869",
                "cp-gr",
                "csIBM869",
            )
        )

        charset(
            "x-IBM921", "IBM921",
            arrayOf<String>(
                "cp921",
                "ibm921",
                "ibm-921",
                "921",
            )
        )

        charset(
            "x-IBM1006", "IBM1006",
            arrayOf<String>(
                "cp1006",
                "ibm1006",
                "ibm-1006",
                "1006",
            )
        )

        charset(
            "x-IBM1046", "IBM1046",
            arrayOf<String>(
                "cp1046",
                "ibm1046",
                "ibm-1046",
                "1046",
            )
        )

        charset(
            "IBM1047", "IBM1047",
            arrayOf<String>(
                "cp1047",
                "ibm-1047",
                "1047",
            )
        )

        charset(
            "x-IBM1098", "IBM1098",
            arrayOf<String>(
                "cp1098",
                "ibm1098",
                "ibm-1098",
                "1098",
            )
        )

        charset(
            "IBM037", "IBM037",
            arrayOf<String>(
                "cp037",
                "ibm037",
                "ebcdic-cp-us",
                "ebcdic-cp-ca",
                "ebcdic-cp-wt",
                "ebcdic-cp-nl",
                "csIBM037",
                "cs-ebcdic-cp-us",
                "cs-ebcdic-cp-ca",
                "cs-ebcdic-cp-wt",
                "cs-ebcdic-cp-nl",
                "ibm-037",
                "ibm-37",
                "cpibm37",
                "037",
            )
        )

        charset(
            "x-IBM1025", "IBM1025",
            arrayOf<String>(
                "cp1025",
                "ibm1025",
                "ibm-1025",
                "1025",
            )
        )

        charset(
            "IBM1026", "IBM1026",
            arrayOf<String>(
                "cp1026",
                "ibm1026",
                "ibm-1026",
                "1026",
            )
        )

        charset(
            "x-IBM1112", "IBM1112",
            arrayOf<String>(
                "cp1112",
                "ibm1112",
                "ibm-1112",
                "1112",
            )
        )

        charset(
            "x-IBM1122", "IBM1122",
            arrayOf<String>(
                "cp1122",
                "ibm1122",
                "ibm-1122",
                "1122",
            )
        )

        charset(
            "x-IBM1123", "IBM1123",
            arrayOf<String>(
                "cp1123",
                "ibm1123",
                "ibm-1123",
                "1123",
            )
        )

        charset(
            "x-IBM1124", "IBM1124",
            arrayOf<String>(
                "cp1124",
                "ibm1124",
                "ibm-1124",
                "1124",
            )
        )

        charset(
            "x-IBM1129", "IBM1129",
            arrayOf<String>(
                "cp1129",
                "ibm1129",
                "ibm-1129",
                "1129",
            )
        )

        charset(
            "x-IBM1364", "IBM1364",
            arrayOf<String>(
                "cp1364",
                "ibm1364",
                "ibm-1364",
                "1364",
            )
        )

        charset(
            "IBM273", "IBM273",
            arrayOf<String>(
                "cp273",
                "ibm273",
                "ibm-273",
                "273",
            )
        )

        charset(
            "IBM277", "IBM277",
            arrayOf<String>(
                "cp277",
                "ibm277",
                "ibm-277",
                "277",
            )
        )

        charset(
            "IBM278", "IBM278",
            arrayOf<String>(
                "cp278",
                "ibm278",
                "ibm-278",
                "278",
                "ebcdic-sv",
                "ebcdic-cp-se",
                "csIBM278",
            )
        )

        charset(
            "IBM280", "IBM280",
            arrayOf<String>(
                "cp280",
                "ibm280",
                "ibm-280",
                "280",
            )
        )

        charset(
            "IBM284", "IBM284",
            arrayOf<String>(
                "cp284",
                "ibm284",
                "ibm-284",
                "284",
                "csIBM284",
                "cpibm284",
            )
        )

        charset(
            "IBM285", "IBM285",
            arrayOf<String>(
                "cp285",
                "ibm285",
                "ibm-285",
                "285",
                "ebcdic-cp-gb",
                "ebcdic-gb",
                "csIBM285",
                "cpibm285",
            )
        )

        charset(
            "IBM297", "IBM297",
            arrayOf<String>(
                "cp297",
                "ibm297",
                "ibm-297",
                "297",
                "ebcdic-cp-fr",
                "cpibm297",
                "csIBM297",
            )
        )

        charset(
            "IBM420", "IBM420",
            arrayOf<String>(
                "cp420",
                "ibm420",
                "ibm-420",
                "ebcdic-cp-ar1",
                "420",
                "csIBM420",
            )
        )

        charset(
            "IBM424", "IBM424",
            arrayOf<String>(
                "cp424",
                "ibm424",
                "ibm-424",
                "424",
                "ebcdic-cp-he",
                "csIBM424",
            )
        )

        charset(
            "IBM500", "IBM500",
            arrayOf<String>(
                "cp500",
                "ibm500",
                "ibm-500",
                "500",
                "ebcdic-cp-ch",
                "ebcdic-cp-bh",
                "csIBM500",
            )
        )

        charset(
            "x-IBM833", "IBM833",
            arrayOf<String>(
                "cp833",
                "ibm833",
                "ibm-833",
                "833",
            )
        )

        charset(
            "x-IBM834", "IBM834",
            arrayOf<String>(
                "cp834",
                "ibm834",
                "834",
                "ibm-834",
            )
        )

        charset(
            "IBM-Thai", "IBM838",
            arrayOf<String>(
                "cp838",
                "ibm838",
                "ibm-838",
                "838",
            )
        )

        charset(
            "IBM870", "IBM870",
            arrayOf<String>(
                "cp870",
                "ibm870",
                "ibm-870",
                "870",
                "ebcdic-cp-roece",
                "ebcdic-cp-yu",
                "csIBM870",
            )
        )

        charset(
            "IBM871", "IBM871",
            arrayOf<String>(
                "cp871",
                "ibm871",
                "ibm-871",
                "871",
                "ebcdic-cp-is",
                "csIBM871",
            )
        )

        charset(
            "x-IBM875", "IBM875",
            arrayOf<String>(
                "cp875",
                "ibm875",
                "ibm-875",
                "875",
            )
        )

        charset(
            "IBM918", "IBM918",
            arrayOf<String>(
                "cp918",
                "ibm-918",
                "918",
                "ebcdic-cp-ar2",
            )
        )

        charset(
            "x-IBM922", "IBM922",
            arrayOf<String>(
                "cp922",
                "ibm922",
                "ibm-922",
                "922",
            )
        )

        charset(
            "x-IBM1097", "IBM1097",
            arrayOf<String>(
                "cp1097",
                "ibm1097",
                "ibm-1097",
                "1097",
            )
        )

        charset(
            "x-IBM949", "IBM949",
            arrayOf<String>(
                "cp949",
                "ibm949",
                "ibm-949",
                "949",
            )
        )

        charset(
            "x-IBM949C", "IBM949C",
            arrayOf<String>(
                "cp949C",
                "ibm949C",
                "ibm-949C",
                "949C",
            )
        )

        charset(
            "x-IBM939", "IBM939",
            arrayOf<String>(
                "cp939",
                "ibm939",
                "ibm-939",
                "939",
            )
        )

        charset(
            "x-IBM933", "IBM933",
            arrayOf<String>(
                "cp933",
                "ibm933",
                "ibm-933",
                "933",
            )
        )

        charset(
            "x-IBM1381", "IBM1381",
            arrayOf<String>(
                "cp1381",
                "ibm1381",
                "ibm-1381",
                "1381",
            )
        )

        charset(
            "x-IBM1383", "IBM1383",
            arrayOf<String>(
                "cp1383",
                "ibm1383",
                "ibm-1383",
                "1383",
                "ibmeuccn",
                "ibm-euccn",
                "cpeuccn",
            )
        )

        charset(
            "x-IBM970", "IBM970",
            arrayOf<String>(
                "cp970",
                "ibm970",
                "ibm-970",
                "ibm-eucKR",
                "970",
            )
        )

        charset(
            "x-IBM964", "IBM964",
            arrayOf<String>(
                "cp964",
                "ibm964",
                "ibm-964",
                "ibm-euctw",
                "964",
            )
        )

        charset(
            "x-IBM29626C", "IBM29626C",
            arrayOf<String>(
                "cp29626c",
                "ibm29626c",
                "ibm-29626c",
                "29626c",
                "ibm-eucjp",
            )
        )

        charset(
            "x-IBM33722", "IBM33722",
            arrayOf<String>(
                "cp33722",
                "ibm33722",
                "ibm-33722",
                "ibm-5050",
                "ibm-33722_vascii_vpua",
                "33722",
            )
        )

        charset(
            "IBM01140", "IBM1140",
            arrayOf<String>(
                "cp1140",
                "ccsid01140",
                "cp01140",
                "1140",
                "ebcdic-us-037+euro",
                "ibm1140",
                "ibm-1140",
            )
        )

        charset(
            "IBM01141", "IBM1141",
            arrayOf<String>(
                "cp1141",
                "ccsid01141",
                "cp01141",
                "1141",
                "ebcdic-de-273+euro",
                "ibm1141",
                "ibm-1141",
            )
        )

        charset(
            "IBM01142", "IBM1142",
            arrayOf<String>(
                "cp1142",
                "ccsid01142",
                "cp01142",
                "1142",
                "ebcdic-no-277+euro",
                "ebcdic-dk-277+euro",
                "ibm1142",
                "ibm-1142",
            )
        )

        charset(
            "IBM01143", "IBM1143",
            arrayOf<String>(
                "cp1143",
                "ccsid01143",
                "cp01143",
                "1143",
                "ebcdic-fi-278+euro",
                "ebcdic-se-278+euro",
                "ibm1143",
                "ibm-1143",
            )
        )

        charset(
            "IBM01144", "IBM1144",
            arrayOf<String>(
                "cp1144",
                "ccsid01144",
                "cp01144",
                "1144",
                "ebcdic-it-280+euro",
                "ibm1144",
                "ibm-1144",
            )
        )

        charset(
            "IBM01145", "IBM1145",
            arrayOf<String>(
                "cp1145",
                "ccsid01145",
                "cp01145",
                "1145",
                "ebcdic-es-284+euro",
                "ibm1145",
                "ibm-1145",
            )
        )

        charset(
            "IBM01146", "IBM1146",
            arrayOf<String>(
                "cp1146",
                "ccsid01146",
                "cp01146",
                "1146",
                "ebcdic-gb-285+euro",
                "ibm1146",
                "ibm-1146",
            )
        )

        charset(
            "IBM01147", "IBM1147",
            arrayOf<String>(
                "cp1147",
                "ccsid01147",
                "cp01147",
                "1147",
                "ebcdic-fr-277+euro",
                "ibm1147",
                "ibm-1147",
            )
        )

        charset(
            "IBM01148", "IBM1148",
            arrayOf<String>(
                "cp1148",
                "ccsid01148",
                "cp01148",
                "1148",
                "ebcdic-international-500+euro",
                "ibm1148",
                "ibm-1148",
            )
        )

        charset(
            "IBM01149", "IBM1149",
            arrayOf<String>(
                "cp1149",
                "ccsid01149",
                "cp01149",
                "1149",
                "ebcdic-s-871+euro",
                "ibm1149",
                "ibm-1149",
            )
        )

        charset(
            "IBM290", "IBM290",
            arrayOf<String>(
                "cp290",
                "ibm290",
                "ibm-290",
                "csIBM290",
                "EBCDIC-JP-kana",
                "290",
            )
        )

        charset(
            "x-IBM1166", "IBM1166",
            arrayOf<String>(
                "cp1166",
                "ibm1166",
                "ibm-1166",
                "1166",
            )
        )

        charset(
            "x-IBM300", "IBM300",
            arrayOf<String>(
                "cp300",
                "ibm300",
                "ibm-300",
                "300",
            )
        )

        charset(
            "x-MacRoman", "MacRoman",
            arrayOf<String>(
                "MacRoman",
            )
        )

        charset(
            "x-MacCentralEurope", "MacCentralEurope",
            arrayOf<String>(
                "MacCentralEurope",
            )
        )

        charset(
            "x-MacCroatian", "MacCroatian",
            arrayOf<String>(
                "MacCroatian",
            )
        )

        charset(
            "x-MacGreek", "MacGreek",
            arrayOf<String>(
                "MacGreek",
            )
        )

        charset(
            "x-MacCyrillic", "MacCyrillic",
            arrayOf<String>(
                "MacCyrillic",
            )
        )

        charset(
            "x-MacUkraine", "MacUkraine",
            arrayOf<String>(
                "MacUkraine",
            )
        )

        charset(
            "x-MacTurkish", "MacTurkish",
            arrayOf<String>(
                "MacTurkish",
            )
        )

        charset(
            "x-MacArabic", "MacArabic",
            arrayOf<String>(
                "MacArabic",
            )
        )

        charset(
            "x-MacHebrew", "MacHebrew",
            arrayOf<String>(
                "MacHebrew",
            )
        )

        charset(
            "x-MacIceland", "MacIceland",
            arrayOf<String>(
                "MacIceland",
            )
        )

        charset(
            "x-MacRomania", "MacRomania",
            arrayOf<String>(
                "MacRomania",
            )
        )

        charset(
            "x-MacThai", "MacThai",
            arrayOf<String>(
                "MacThai",
            )
        )

        charset(
            "x-MacSymbol", "MacSymbol",
            arrayOf<String>(
                "MacSymbol",
            )
        )

        charset(
            "x-MacDingbat", "MacDingbat",
            arrayOf<String>(
                "MacDingbat",
            )
        )
    }

    @Test
    fun test() {
        printCharsets()
    }
}