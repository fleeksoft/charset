package com.fleeksoft.charset.spi

import com.fleeksoft.charset.Charset
import com.fleeksoft.charset.cs.euc.EUC_CN
import com.fleeksoft.charset.cs.euc.EUC_JP
import com.fleeksoft.charset.cs.euc.EUC_JP_LINUX
import com.fleeksoft.charset.cs.euc.EUC_JP_Open
import com.fleeksoft.charset.cs.ext.*
import com.fleeksoft.charset.cs.jis.JIS_X_0201
import com.fleeksoft.charset.cs.jis.JIS_X_0208
import com.fleeksoft.charset.cs.jis.JIS_X_0212

class ExtendedCharsetProvider : CharsetProvider() {
    override fun charsetForName(charsetName: String): Charset? {
        return getExtCharsetByName(charsetName)
    }

    private fun getExtCharsetByName(name: String): Charset? {
        return charsetClassMap[name]?.let { charsetMap[it]?.invoke() }
    }

    private val charsetClassMap = mapOf<String, String>(
        "csbig5" to "Big5",
        "big5" to "Big5",
        "ms950hkscsxp" to "MS950_HKSCS_XP",
        "xms950hkscsxp" to "MS950_HKSCS_XP",
        "ms950hkscs" to "MS950_HKSCS",
        "xms950hkscs" to "MS950_HKSCS",
        "ms950" to "MS950",
        "windows950" to "MS950",
        "xwindows950" to "MS950",
        "ms874" to "MS874",
        "windows874" to "MS874",
        "xwindows874" to "MS874",
        "euctw" to "EUC_TW",
        "cns11643" to "EUC_TW",
        "xeuctw" to "EUC_TW",
        "big5hkscs" to "Big5_HKSCS",
        "big5hk" to "Big5_HKSCS",
        "big5hkscs2001" to "Big5_HKSCS_2001",
        "big5hk2001" to "Big5_HKSCS_2001",
        "big5hkscs:unicode3.0" to "Big5_HKSCS_2001",
        "xbig5hkscs2001" to "Big5_HKSCS_2001",
        "big5solaris" to "Big5_Solaris",
        "xbig5solaris" to "Big5_Solaris",
        "windows936" to "GBK",
        "cp936" to "GBK",
        "gbk" to "GBK",
        "gb2312" to "EUC_CN",
        "gb231280" to "EUC_CN",
        "gb23121980" to "EUC_CN",
        "euccn" to "EUC_CN",
        "xeuccn" to "EUC_CN",
        "ms936" to "MS936",
        "xmswin936" to "MS936",
        "sjis" to "SJIS",
        "shiftjis" to "SJIS",
        "mskanji" to "SJIS",
        "xsjis" to "SJIS",
        "csshiftjis" to "SJIS",
        "ms932" to "MS932",
        "windows932" to "MS932",
        "cswindows31j" to "MS932",
        "windows31j" to "MS932",
        "jis0201" to "JIS_X_0201",
        "jisx0201" to "JIS_X_0201",
        "x0201" to "JIS_X_0201",
        "cshalfwidthkatakana" to "JIS_X_0201",
        "jis0208" to "JIS_X_0208",
        "jisc62261983" to "JIS_X_0208",
        "isoir87" to "JIS_X_0208",
        "x0208" to "JIS_X_0208",
        "jisx02081983" to "JIS_X_0208",
        "csiso87jisx0208" to "JIS_X_0208",
        "xjis0208" to "JIS_X_0208",
        "jis0212" to "JIS_X_0212",
        "jisx02121990" to "JIS_X_0212",
        "x0212" to "JIS_X_0212",
        "isoir159" to "JIS_X_0212",
        "csiso159jisx02121990" to "JIS_X_0212",
        "sjis0213" to "SJIS_0213",
        "sjis:2004" to "SJIS_0213",
        "sjis0213:2004" to "SJIS_0213",
        "shiftjis0213:2004" to "SJIS_0213",
        "shiftjis:2004" to "SJIS_0213",
        "xsjis0213" to "SJIS_0213",
        "ms9320213" to "MS932_0213",
        "ms932:2004" to "MS932_0213",
        "windows9320213" to "MS932_0213",
        "windows932:2004" to "MS932_0213",
        "xms9320213" to "MS932_0213",
        "eucjp" to "EUC_JP",
        "eucjis" to "EUC_JP",
        "extendedunixcodepackedformatforjapanese" to "EUC_JP",
        "cseucpkdfmtjapanese" to "EUC_JP",
        "xeucjp" to "EUC_JP",
        "eucjplinux" to "EUC_JP_LINUX",
        "xeucjplinux" to "EUC_JP_LINUX",
        "eucjpsolaris" to "EUC_JP_Open",
        "eucjpopen" to "EUC_JP_Open",
        "xeucjpopen" to "EUC_JP_Open",
        "pck" to "PCK",
        "xpck" to "PCK",
        "iso2022jp" to "ISO2022_JP",
        "jis" to "ISO2022_JP",
        "csiso2022jp" to "ISO2022_JP",
        "jisencoding" to "ISO2022_JP",
        "csjisencoding" to "ISO2022_JP",
        "csiso2022jp2" to "ISO2022_JP_2",
        "iso2022jp2" to "ISO2022_JP_2",
        "ms50221" to "MS50221",
        "cp50221" to "MS50221",
        "xwindows50221" to "MS50221",
        "ms50220" to "MS50220",
        "cp50220" to "MS50220",
        "xwindows50220" to "MS50220",
        "windowsiso2022jp" to "MSISO2022JP",
        "xwindowsiso2022jp" to "MSISO2022JP",
        "jisautodetect" to "JISAutoDetect",
        "xjisautodetect" to "JISAutoDetect",
        "euckr" to "EUC_KR",
        "ksc5601" to "EUC_KR",
        "ksc56011987" to "EUC_KR",
        "cseuckr" to "EUC_KR",
        "5601" to "EUC_KR",
        "ms949" to "MS949",
        "windows949" to "MS949",
        "xwindows949" to "MS949",
        "ksc56011992" to "Johab",
        "ms1361" to "Johab",
        "johab" to "Johab",
        "xjohab" to "Johab",
        "iso2022kr" to "ISO2022_KR",
        "csiso2022kr" to "ISO2022_KR",
        "iso2022cn" to "ISO2022_CN",
        "csiso2022cn" to "ISO2022_CN",
        "iso2022cncns" to "ISO2022_CN_CNS",
        "xiso2022cncns" to "ISO2022_CN_CNS",
        "iso2022cngb" to "ISO2022_CN_GB",
        "xiso2022cngb" to "ISO2022_CN_GB",
        "iscii" to "ISCII91",
        "stsev35888" to "ISCII91",
        "isoir153" to "ISCII91",
        "csiso153gost1976874" to "ISCII91",
        "iscii91" to "ISCII91",
        "xiscii91" to "ISCII91",
        "iso88593" to "ISO_8859_3",
        "88593" to "ISO_8859_3",
        "iso88593:1988" to "ISO_8859_3",
        "isoir109" to "ISO_8859_3",
        "latin3" to "ISO_8859_3",
        "l3" to "ISO_8859_3",
        "ibm913" to "ISO_8859_3",
        "cp913" to "ISO_8859_3",
        "913" to "ISO_8859_3",
        "csisolatin3" to "ISO_8859_3",
        "iso88596" to "ISO_8859_6",
        "88596" to "ISO_8859_6",
        "isoir127" to "ISO_8859_6",
        "iso88596:1987" to "ISO_8859_6",
        "ecma114" to "ISO_8859_6",
        "asmo708" to "ISO_8859_6",
        "arabic" to "ISO_8859_6",
        "ibm1089" to "ISO_8859_6",
        "cp1089" to "ISO_8859_6",
        "1089" to "ISO_8859_6",
        "csisolatinarabic" to "ISO_8859_6",
        "iso88598" to "ISO_8859_8",
        "88598" to "ISO_8859_8",
        "isoir138" to "ISO_8859_8",
        "iso88598:1988" to "ISO_8859_8",
        "cp916" to "ISO_8859_8",
        "916" to "ISO_8859_8",
        "ibm916" to "ISO_8859_8",
        "hebrew" to "ISO_8859_8",
        "csisolatinhebrew" to "ISO_8859_8",
        "iso885911" to "ISO_8859_11",
        "xiso885911" to "ISO_8859_11",
        "tis620" to "TIS_620",
        "tis620.2533" to "TIS_620",
        "cp1255" to "MS1255",
        "windows1255" to "MS1255",
        "cp1256" to "MS1256",
        "windows1256" to "MS1256",
        "cp1258" to "MS1258",
        "windows1258" to "MS1258",
        "cp942" to "IBM942",
        "ibm942" to "IBM942",
        "942" to "IBM942",
        "xibm942" to "IBM942",
        "cp942c" to "IBM942C",
        "ibm942c" to "IBM942C",
        "942c" to "IBM942C",
        "cp932" to "IBM942C",
        "ibm932" to "IBM942C",
        "932" to "IBM942C",
        "xibm932" to "IBM942C",
        "xibm942c" to "IBM942C",
        "cp943" to "IBM943",
        "ibm943" to "IBM943",
        "943" to "IBM943",
        "xibm943" to "IBM943",
        "cp943c" to "IBM943C",
        "ibm943c" to "IBM943C",
        "943c" to "IBM943C",
        "xibm943c" to "IBM943C",
        "cp948" to "IBM948",
        "ibm948" to "IBM948",
        "948" to "IBM948",
        "xibm948" to "IBM948",
        "cp950" to "IBM950",
        "ibm950" to "IBM950",
        "950" to "IBM950",
        "xibm950" to "IBM950",
        "cp930" to "IBM930",
        "ibm930" to "IBM930",
        "930" to "IBM930",
        "xibm930" to "IBM930",
        "cp935" to "IBM935",
        "ibm935" to "IBM935",
        "935" to "IBM935",
        "xibm935" to "IBM935",
        "cp937" to "IBM937",
        "ibm937" to "IBM937",
        "937" to "IBM937",
        "xibm937" to "IBM937",
        "cp856" to "IBM856",
        "ibm856" to "IBM856",
        "856" to "IBM856",
        "xibm856" to "IBM856",
        "cp860" to "IBM860",
        "ibm860" to "IBM860",
        "860" to "IBM860",
        "csibm860" to "IBM860",
        "cp861" to "IBM861",
        "ibm861" to "IBM861",
        "861" to "IBM861",
        "csibm861" to "IBM861",
        "cpis" to "IBM861",
        "cp863" to "IBM863",
        "ibm863" to "IBM863",
        "863" to "IBM863",
        "csibm863" to "IBM863",
        "cp864" to "IBM864",
        "ibm864" to "IBM864",
        "864" to "IBM864",
        "csibm864" to "IBM864",
        "cp865" to "IBM865",
        "ibm865" to "IBM865",
        "865" to "IBM865",
        "csibm865" to "IBM865",
        "cp868" to "IBM868",
        "ibm868" to "IBM868",
        "868" to "IBM868",
        "cpar" to "IBM868",
        "csibm868" to "IBM868",
        "cp869" to "IBM869",
        "ibm869" to "IBM869",
        "869" to "IBM869",
        "cpgr" to "IBM869",
        "csibm869" to "IBM869",
        "cp921" to "IBM921",
        "ibm921" to "IBM921",
        "921" to "IBM921",
        "xibm921" to "IBM921",
        "cp1006" to "IBM1006",
        "ibm1006" to "IBM1006",
        "1006" to "IBM1006",
        "xibm1006" to "IBM1006",
        "cp1046" to "IBM1046",
        "ibm1046" to "IBM1046",
        "1046" to "IBM1046",
        "xibm1046" to "IBM1046",
        "cp1047" to "IBM1047",
        "ibm1047" to "IBM1047",
        "1047" to "IBM1047",
        "cp1098" to "IBM1098",
        "ibm1098" to "IBM1098",
        "1098" to "IBM1098",
        "xibm1098" to "IBM1098",
        "cp037" to "IBM037",
        "ibm037" to "IBM037",
        "ebcdiccpus" to "IBM037",
        "ebcdiccpca" to "IBM037",
        "ebcdiccpwt" to "IBM037",
        "ebcdiccpnl" to "IBM037",
        "csibm037" to "IBM037",
        "csebcdiccpus" to "IBM037",
        "csebcdiccpca" to "IBM037",
        "csebcdiccpwt" to "IBM037",
        "csebcdiccpnl" to "IBM037",
        "ibm37" to "IBM037",
        "cpibm37" to "IBM037",
        "037" to "IBM037",
        "cp1025" to "IBM1025",
        "ibm1025" to "IBM1025",
        "1025" to "IBM1025",
        "xibm1025" to "IBM1025",
        "cp1026" to "IBM1026",
        "ibm1026" to "IBM1026",
        "1026" to "IBM1026",
        "cp1112" to "IBM1112",
        "ibm1112" to "IBM1112",
        "1112" to "IBM1112",
        "xibm1112" to "IBM1112",
        "cp1122" to "IBM1122",
        "ibm1122" to "IBM1122",
        "1122" to "IBM1122",
        "xibm1122" to "IBM1122",
        "cp1123" to "IBM1123",
        "ibm1123" to "IBM1123",
        "1123" to "IBM1123",
        "xibm1123" to "IBM1123",
        "cp1124" to "IBM1124",
        "ibm1124" to "IBM1124",
        "1124" to "IBM1124",
        "xibm1124" to "IBM1124",
        "cp1129" to "IBM1129",
        "ibm1129" to "IBM1129",
        "1129" to "IBM1129",
        "xibm1129" to "IBM1129",
        "cp1364" to "IBM1364",
        "ibm1364" to "IBM1364",
        "1364" to "IBM1364",
        "xibm1364" to "IBM1364",
        "cp273" to "IBM273",
        "ibm273" to "IBM273",
        "273" to "IBM273",
        "cp277" to "IBM277",
        "ibm277" to "IBM277",
        "277" to "IBM277",
        "cp278" to "IBM278",
        "ibm278" to "IBM278",
        "278" to "IBM278",
        "ebcdicsv" to "IBM278",
        "ebcdiccpse" to "IBM278",
        "csibm278" to "IBM278",
        "cp280" to "IBM280",
        "ibm280" to "IBM280",
        "280" to "IBM280",
        "cp284" to "IBM284",
        "ibm284" to "IBM284",
        "284" to "IBM284",
        "csibm284" to "IBM284",
        "cpibm284" to "IBM284",
        "cp285" to "IBM285",
        "ibm285" to "IBM285",
        "285" to "IBM285",
        "ebcdiccpgb" to "IBM285",
        "ebcdicgb" to "IBM285",
        "csibm285" to "IBM285",
        "cpibm285" to "IBM285",
        "cp297" to "IBM297",
        "ibm297" to "IBM297",
        "297" to "IBM297",
        "ebcdiccpfr" to "IBM297",
        "cpibm297" to "IBM297",
        "csibm297" to "IBM297",
        "cp420" to "IBM420",
        "ibm420" to "IBM420",
        "ebcdiccpar1" to "IBM420",
        "420" to "IBM420",
        "csibm420" to "IBM420",
        "cp424" to "IBM424",
        "ibm424" to "IBM424",
        "424" to "IBM424",
        "ebcdiccphe" to "IBM424",
        "csibm424" to "IBM424",
        "cp500" to "IBM500",
        "ibm500" to "IBM500",
        "500" to "IBM500",
        "ebcdiccpch" to "IBM500",
        "ebcdiccpbh" to "IBM500",
        "csibm500" to "IBM500",
        "cp833" to "IBM833",
        "ibm833" to "IBM833",
        "833" to "IBM833",
        "xibm833" to "IBM833",
        "cp834" to "IBM834",
        "ibm834" to "IBM834",
        "834" to "IBM834",
        "xibm834" to "IBM834",
        "cp838" to "IBM838",
        "ibm838" to "IBM838",
        "838" to "IBM838",
        "ibmthai" to "IBM838",
        "cp870" to "IBM870",
        "ibm870" to "IBM870",
        "870" to "IBM870",
        "ebcdiccproece" to "IBM870",
        "ebcdiccpyu" to "IBM870",
        "csibm870" to "IBM870",
        "cp871" to "IBM871",
        "ibm871" to "IBM871",
        "871" to "IBM871",
        "ebcdiccpis" to "IBM871",
        "csibm871" to "IBM871",
        "cp875" to "IBM875",
        "ibm875" to "IBM875",
        "875" to "IBM875",
        "xibm875" to "IBM875",
        "cp918" to "IBM918",
        "ibm918" to "IBM918",
        "918" to "IBM918",
        "ebcdiccpar2" to "IBM918",
        "cp922" to "IBM922",
        "ibm922" to "IBM922",
        "922" to "IBM922",
        "xibm922" to "IBM922",
        "cp1097" to "IBM1097",
        "ibm1097" to "IBM1097",
        "1097" to "IBM1097",
        "xibm1097" to "IBM1097",
        "cp949" to "IBM949",
        "ibm949" to "IBM949",
        "949" to "IBM949",
        "xibm949" to "IBM949",
        "cp949c" to "IBM949C",
        "ibm949c" to "IBM949C",
        "949c" to "IBM949C",
        "xibm949c" to "IBM949C",
        "cp939" to "IBM939",
        "ibm939" to "IBM939",
        "939" to "IBM939",
        "xibm939" to "IBM939",
        "cp933" to "IBM933",
        "ibm933" to "IBM933",
        "933" to "IBM933",
        "xibm933" to "IBM933",
        "cp1381" to "IBM1381",
        "ibm1381" to "IBM1381",
        "1381" to "IBM1381",
        "xibm1381" to "IBM1381",
        "cp1383" to "IBM1383",
        "ibm1383" to "IBM1383",
        "1383" to "IBM1383",
        "ibmeuccn" to "IBM1383",
        "cpeuccn" to "IBM1383",
        "xibm1383" to "IBM1383",
        "cp970" to "IBM970",
        "ibm970" to "IBM970",
        "ibmeuckr" to "IBM970",
        "970" to "IBM970",
        "xibm970" to "IBM970",
        "cp964" to "IBM964",
        "ibm964" to "IBM964",
        "ibmeuctw" to "IBM964",
        "964" to "IBM964",
        "xibm964" to "IBM964",
        "cp29626c" to "IBM29626C",
        "ibm29626c" to "IBM29626C",
        "29626c" to "IBM29626C",
        "ibmeucjp" to "IBM29626C",
        "xibm29626c" to "IBM29626C",
        "cp33722" to "IBM33722",
        "ibm33722" to "IBM33722",
        "ibm5050" to "IBM33722",
        "ibm33722vasciivpua" to "IBM33722",
        "33722" to "IBM33722",
        "xibm33722" to "IBM33722",
        "cp1140" to "IBM1140",
        "ccsid01140" to "IBM1140",
        "cp01140" to "IBM1140",
        "1140" to "IBM1140",
        "ebcdicus037+euro" to "IBM1140",
        "ibm1140" to "IBM1140",
        "ibm01140" to "IBM1140",
        "cp1141" to "IBM1141",
        "ccsid01141" to "IBM1141",
        "cp01141" to "IBM1141",
        "1141" to "IBM1141",
        "ebcdicde273+euro" to "IBM1141",
        "ibm1141" to "IBM1141",
        "ibm01141" to "IBM1141",
        "cp1142" to "IBM1142",
        "ccsid01142" to "IBM1142",
        "cp01142" to "IBM1142",
        "1142" to "IBM1142",
        "ebcdicno277+euro" to "IBM1142",
        "ebcdicdk277+euro" to "IBM1142",
        "ibm1142" to "IBM1142",
        "ibm01142" to "IBM1142",
        "cp1143" to "IBM1143",
        "ccsid01143" to "IBM1143",
        "cp01143" to "IBM1143",
        "1143" to "IBM1143",
        "ebcdicfi278+euro" to "IBM1143",
        "ebcdicse278+euro" to "IBM1143",
        "ibm1143" to "IBM1143",
        "ibm01143" to "IBM1143",
        "cp1144" to "IBM1144",
        "ccsid01144" to "IBM1144",
        "cp01144" to "IBM1144",
        "1144" to "IBM1144",
        "ebcdicit280+euro" to "IBM1144",
        "ibm1144" to "IBM1144",
        "ibm01144" to "IBM1144",
        "cp1145" to "IBM1145",
        "ccsid01145" to "IBM1145",
        "cp01145" to "IBM1145",
        "1145" to "IBM1145",
        "ebcdices284+euro" to "IBM1145",
        "ibm1145" to "IBM1145",
        "ibm01145" to "IBM1145",
        "cp1146" to "IBM1146",
        "ccsid01146" to "IBM1146",
        "cp01146" to "IBM1146",
        "1146" to "IBM1146",
        "ebcdicgb285+euro" to "IBM1146",
        "ibm1146" to "IBM1146",
        "ibm01146" to "IBM1146",
        "cp1147" to "IBM1147",
        "ccsid01147" to "IBM1147",
        "cp01147" to "IBM1147",
        "1147" to "IBM1147",
        "ebcdicfr277+euro" to "IBM1147",
        "ibm1147" to "IBM1147",
        "ibm01147" to "IBM1147",
        "cp1148" to "IBM1148",
        "ccsid01148" to "IBM1148",
        "cp01148" to "IBM1148",
        "1148" to "IBM1148",
        "ebcdicinternational500+euro" to "IBM1148",
        "ibm1148" to "IBM1148",
        "ibm01148" to "IBM1148",
        "cp1149" to "IBM1149",
        "ccsid01149" to "IBM1149",
        "cp01149" to "IBM1149",
        "1149" to "IBM1149",
        "ebcdics871+euro" to "IBM1149",
        "ibm1149" to "IBM1149",
        "ibm01149" to "IBM1149",
        "cp290" to "IBM290",
        "ibm290" to "IBM290",
        "csibm290" to "IBM290",
        "ebcdicjpkana" to "IBM290",
        "290" to "IBM290",
        "cp1166" to "IBM1166",
        "ibm1166" to "IBM1166",
        "1166" to "IBM1166",
        "xibm1166" to "IBM1166",
        "cp300" to "IBM300",
        "ibm300" to "IBM300",
        "300" to "IBM300",
        "xibm300" to "IBM300",
        "macroman" to "MacRoman",
        "xmacroman" to "MacRoman",
        "maccentraleurope" to "MacCentralEurope",
        "xmaccentraleurope" to "MacCentralEurope",
        "maccroatian" to "MacCroatian",
        "xmaccroatian" to "MacCroatian",
        "macgreek" to "MacGreek",
        "xmacgreek" to "MacGreek",
        "maccyrillic" to "MacCyrillic",
        "xmaccyrillic" to "MacCyrillic",
        "macukraine" to "MacUkraine",
        "xmacukraine" to "MacUkraine",
        "macturkish" to "MacTurkish",
        "xmacturkish" to "MacTurkish",
        "macarabic" to "MacArabic",
        "xmacarabic" to "MacArabic",
        "machebrew" to "MacHebrew",
        "xmachebrew" to "MacHebrew",
        "maciceland" to "MacIceland",
        "xmaciceland" to "MacIceland",
        "macromania" to "MacRomania",
        "xmacromania" to "MacRomania",
        "macthai" to "MacThai",
        "xmacthai" to "MacThai",
        "macsymbol" to "MacSymbol",
        "xmacsymbol" to "MacSymbol",
        "macdingbat" to "MacDingbat",
        "xmacdingbat" to "MacDingbat",
    )
    private val charsetMap = mapOf<String, () -> Charset>(
        "Big5" to { Big5() },
        "MS950_HKSCS_XP" to { MS950_HKSCS_XP() },
        "MS950_HKSCS" to { MS950_HKSCS() },
        "MS950" to { MS950() },
        "MS874" to { MS874() },
        "EUC_TW" to { EUC_TW() },
        "Big5_HKSCS" to { Big5_HKSCS() },
        "Big5_HKSCS_2001" to { Big5_HKSCS_2001() },
        "Big5_Solaris" to { Big5_Solaris() },
        "GBK" to { GBK() },
        "EUC_CN" to { EUC_CN() },
        "MS936" to { MS936() },
        "SJIS" to { SJIS() },
        "MS932" to { MS932() },
        "JIS_X_0201" to { JIS_X_0201() },
        "JIS_X_0208" to { JIS_X_0208() },
        "JIS_X_0212" to { JIS_X_0212() },
//        "SJIS_0213" to { SJIS_0213() },
//        "MS932_0213" to { MS932_0213() },
        "EUC_JP" to { EUC_JP() },
        "EUC_JP_LINUX" to { EUC_JP_LINUX() },
        "EUC_JP_Open" to { EUC_JP_Open() },
        "PCK" to { PCK() },
        "ISO2022_JP" to { ISO2022_JP() },
        "ISO2022_JP_2" to { ISO2022_JP_2() },
        "MS50221" to { MS50221() },
        "MS50220" to { MS50220() },
        "MSISO2022JP" to { MSISO2022JP() },
        "JISAutoDetect" to { JISAutoDetect() },
        "MS949" to { MS949() },
        "Johab" to { Johab() },
        "ISO2022_KR" to { ISO2022_KR() },
        "ISO2022_CN" to { ISO2022_CN() },
        "ISO2022_CN_CNS" to { ISO2022_CN_CNS() },
        "ISO2022_CN_GB" to { ISO2022_CN_GB() },
        "ISCII91" to { ISCII91() },
        "ISO_8859_3" to { ISO_8859_3() },
        "ISO_8859_6" to { ISO_8859_6() },
        "ISO_8859_8" to { ISO_8859_8() },
        "ISO_8859_11" to { ISO_8859_11() },
        "TIS_620" to { TIS_620() },
        "MS1255" to { MS1255() },
        "MS1256" to { MS1256() },
        "MS1258" to { MS1258() },
        "IBM942" to { IBM942() },
        "IBM942C" to { IBM942C() },
        "IBM943" to { IBM943() },
        "IBM943C" to { IBM943C() },
        "IBM948" to { IBM948() },
        "IBM950" to { IBM950() },
        "IBM930" to { IBM930() },
        "IBM935" to { IBM935() },
        "IBM937" to { IBM937() },
        "IBM856" to { IBM856() },
        "IBM860" to { IBM860() },
        "IBM861" to { IBM861() },
        "IBM863" to { IBM863() },
        "IBM864" to { IBM864() },
        "IBM865" to { IBM865() },
        "IBM868" to { IBM868() },
        "IBM869" to { IBM869() },
        "IBM921" to { IBM921() },
        "IBM1006" to { IBM1006() },
        "IBM1046" to { IBM1046() },
        "IBM1047" to { IBM1047() },
        "IBM1098" to { IBM1098() },
        "IBM037" to { IBM037() },
        "IBM1025" to { IBM1025() },
        "IBM1026" to { IBM1026() },
        "IBM1112" to { IBM1112() },
        "IBM1122" to { IBM1122() },
        "IBM1123" to { IBM1123() },
        "IBM1124" to { IBM1124() },
        "IBM1129" to { IBM1129() },
        "IBM1364" to { IBM1364() },
        "IBM273" to { IBM273() },
        "IBM277" to { IBM277() },
        "IBM278" to { IBM278() },
        "IBM280" to { IBM280() },
        "IBM284" to { IBM284() },
        "IBM285" to { IBM285() },
        "IBM297" to { IBM297() },
        "IBM420" to { IBM420() },
        "IBM424" to { IBM424() },
        "IBM500" to { IBM500() },
        "IBM833" to { IBM833() },
        "IBM834" to { IBM834() },
        "IBM838" to { IBM838() },
        "IBM870" to { IBM870() },
        "IBM871" to { IBM871() },
        "IBM875" to { IBM875() },
        "IBM918" to { IBM918() },
        "IBM922" to { IBM922() },
        "IBM1097" to { IBM1097() },
        "IBM949" to { IBM949() },
        "IBM949C" to { IBM949C() },
        "IBM939" to { IBM939() },
        "IBM933" to { IBM933() },
        "IBM1381" to { IBM1381() },
        "IBM1383" to { IBM1383() },
        "IBM970" to { IBM970() },
        "IBM964" to { IBM964() },
        "IBM29626C" to { IBM29626C() },
        "IBM33722" to { IBM33722() },
        "IBM1140" to { IBM1140() },
        "IBM1141" to { IBM1141() },
        "IBM1142" to { IBM1142() },
        "IBM1143" to { IBM1143() },
        "IBM1144" to { IBM1144() },
        "IBM1145" to { IBM1145() },
        "IBM1146" to { IBM1146() },
        "IBM1147" to { IBM1147() },
        "IBM1148" to { IBM1148() },
        "IBM1149" to { IBM1149() },
        "IBM290" to { IBM290() },
        "IBM1166" to { IBM1166() },
        "IBM300" to { IBM300() },
        "MacRoman" to { MacRoman() },
        "MacCentralEurope" to { MacCentralEurope() },
        "MacCroatian" to { MacCroatian() },
        "MacGreek" to { MacGreek() },
        "MacCyrillic" to { MacCyrillic() },
        "MacUkraine" to { MacUkraine() },
        "MacTurkish" to { MacTurkish() },
        "MacArabic" to { MacArabic() },
        "MacHebrew" to { MacHebrew() },
        "MacIceland" to { MacIceland() },
        "MacRomania" to { MacRomania() },
        "MacThai" to { MacThai() },
        "MacSymbol" to { MacSymbol() },
        "MacDingbat" to { MacDingbat() },
    )
}