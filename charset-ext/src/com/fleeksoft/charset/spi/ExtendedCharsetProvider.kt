package com.fleeksoft.charset.spi

import com.fleeksoft.charset.Charset
import com.fleeksoft.charset.cs.ext.*

class ExtendedCharsetProvider : CharsetProvider() {
    override fun charsetForName(charsetName: String): Charset? {
        return getExtCharsetByName(charsetName)
    }

    private fun getExtCharsetByName(name: String): Charset? {
        return when (name) {
            "csbig5", "big5" -> {
                Big5()
            }

            "ms950hkscsxp", "xms950hkscsxp" -> {
                MS950_HKSCS_XP()
            }

            "ms950hkscs", "xms950hkscs" -> {
                MS950_HKSCS()
            }

            "ms950", "windows950", "xwindows950" -> {
                MS950()
            }

            "ms874", "windows874", "xwindows874" -> {
                MS874()
            }

            "euctw", "cns11643", "xeuctw" -> {
                EUC_TW()
            }

            "big5hkscs", "big5hk" -> {
                Big5_HKSCS()
            }

            "big5hkscs2001", "big5hk2001", "big5hkscs:unicode3.0", "xbig5hkscs2001" -> {
                Big5_HKSCS_2001()
            }

            "big5solaris", "xbig5solaris" -> {
                Big5_Solaris()
            }

            "windows936", "cp936", "gbk" -> {
                GBK()
            }

            "gb2312", "gb231280", "gb23121980", "euccn", "xeuccn" -> {
                EUC_CN()
            }

            "ms936", "xmswin936" -> {
                MS936()
            }

            "sjis", "shiftjis", "mskanji", "xsjis", "csshiftjis" -> {
                SJIS()
            }

            "ms932", "windows932", "cswindows31j", "windows31j" -> {
                MS932()
            }

            "jis0201", "jisx0201", "x0201", "cshalfwidthkatakana" -> {
                JIS_X_0201()
            }

            "jis0208", "jisc62261983", "isoir87", "x0208", "jisx02081983", "csiso87jisx0208", "xjis0208" -> {
                JIS_X_0208()
            }

            "jis0212", "jisx02121990", "x0212", "isoir159", "csiso159jisx02121990" -> {
                JIS_X_0212()
            }
//            "sjis0213", "sjis:2004", "sjis0213:2004", "shiftjis0213:2004", "shiftjis:2004", "xsjis0213" -> { SJIS_0213() }
//            "ms9320213", "ms932:2004", "windows9320213", "windows932:2004", "xms9320213" -> { MS932_0213() }
            "eucjp", "eucjis", "extendedunixcodepackedformatforjapanese", "cseucpkdfmtjapanese", "xeucjp" -> {
                EUC_JP()
            }

            "eucjplinux", "xeucjplinux" -> {
                EUC_JP_LINUX()
            }

            "eucjpsolaris", "eucjpopen", "xeucjpopen" -> {
                EUC_JP_Open()
            }

            "pck", "xpck" -> {
                PCK()
            }

            "iso2022jp", "jis", "csiso2022jp", "jisencoding", "csjisencoding" -> {
                ISO2022_JP()
            }

            "csiso2022jp2", "iso2022jp2" -> {
                ISO2022_JP_2()
            }

            "ms50221", "cp50221", "xwindows50221" -> {
                MS50221()
            }

            "ms50220", "cp50220", "xwindows50220" -> {
                MS50220()
            }

            "windowsiso2022jp", "xwindowsiso2022jp" -> {
                MSISO2022JP()
            }

            "jisautodetect", "xjisautodetect" -> {
                JISAutoDetect()
            }

            "euckr", "ksc5601", "ksc56011987", "cseuckr", "5601" -> {
                EUC_KR()
            }

            "ms949", "windows949", "xwindows949" -> {
                MS949()
            }

            "ksc56011992", "ms1361", "johab", "xjohab" -> {
                Johab()
            }

            "iso2022kr", "csiso2022kr" -> {
                ISO2022_KR()
            }

            "iso2022cn", "csiso2022cn" -> {
                ISO2022_CN()
            }

            "iso2022cncns", "xiso2022cncns" -> {
                ISO2022_CN_CNS()
            }

            "iso2022cngb", "xiso2022cngb" -> {
                ISO2022_CN_GB()
            }

            "iscii", "stsev35888", "isoir153", "csiso153gost1976874", "iscii91", "xiscii91" -> {
                ISCII91()
            }

            "iso88593", "88593", "iso88593:1988", "isoir109", "latin3", "l3", "ibm913", "cp913", "913", "csisolatin3" -> {
                ISO_8859_3()
            }

            "iso88596", "88596", "isoir127", "iso88596:1987", "ecma114", "asmo708", "arabic", "ibm1089", "cp1089", "1089", "csisolatinarabic" -> {
                ISO_8859_6()
            }

            "iso88598", "88598", "isoir138", "iso88598:1988", "cp916", "916", "ibm916", "hebrew", "csisolatinhebrew" -> {
                ISO_8859_8()
            }

            "iso885911", "xiso885911" -> {
                ISO_8859_11()
            }

            "tis620", "tis620.2533" -> {
                TIS_620()
            }

            "cp1255", "windows1255" -> {
                MS1255()
            }

            "cp1256", "windows1256" -> {
                MS1256()
            }

            "cp1258", "windows1258" -> {
                MS1258()
            }

            "cp942", "ibm942", "942", "xibm942" -> {
                IBM942()
            }

            "cp942c", "ibm942c", "942c", "cp932", "ibm932", "932", "xibm932", "xibm942c" -> {
                IBM942C()
            }

            "cp943", "ibm943", "943", "xibm943" -> {
                IBM943()
            }

            "cp943c", "ibm943c", "943c", "xibm943c" -> {
                IBM943C()
            }

            "cp948", "ibm948", "948", "xibm948" -> {
                IBM948()
            }

            "cp950", "ibm950", "950", "xibm950" -> {
                IBM950()
            }

            "cp930", "ibm930", "930", "xibm930" -> {
                IBM930()
            }

            "cp935", "ibm935", "935", "xibm935" -> {
                IBM935()
            }

            "cp937", "ibm937", "937", "xibm937" -> {
                IBM937()
            }

            "cp856", "ibm856", "856", "xibm856" -> {
                IBM856()
            }

            "cp860", "ibm860", "860", "csibm860" -> {
                IBM860()
            }

            "cp861", "ibm861", "861", "csibm861", "cpis" -> {
                IBM861()
            }

            "cp863", "ibm863", "863", "csibm863" -> {
                IBM863()
            }

            "cp864", "ibm864", "864", "csibm864" -> {
                IBM864()
            }

            "cp865", "ibm865", "865", "csibm865" -> {
                IBM865()
            }

            "cp868", "ibm868", "868", "cpar", "csibm868" -> {
                IBM868()
            }

            "cp869", "ibm869", "869", "cpgr", "csibm869" -> {
                IBM869()
            }

            "cp921", "ibm921", "921", "xibm921" -> {
                IBM921()
            }

            "cp1006", "ibm1006", "1006", "xibm1006" -> {
                IBM1006()
            }

            "cp1046", "ibm1046", "1046", "xibm1046" -> {
                IBM1046()
            }

            "cp1047", "ibm1047", "1047" -> {
                IBM1047()
            }

            "cp1098", "ibm1098", "1098", "xibm1098" -> {
                IBM1098()
            }

            "cp037", "ibm037", "ebcdiccpus", "ebcdiccpca", "ebcdiccpwt", "ebcdiccpnl", "csibm037", "csebcdiccpus", "csebcdiccpca", "csebcdiccpwt", "csebcdiccpnl", "ibm37", "cpibm37", "037" -> {
                IBM037()
            }

            "cp1025", "ibm1025", "1025", "xibm1025" -> {
                IBM1025()
            }

            "cp1026", "ibm1026", "1026" -> {
                IBM1026()
            }

            "cp1112", "ibm1112", "1112", "xibm1112" -> {
                IBM1112()
            }

            "cp1122", "ibm1122", "1122", "xibm1122" -> {
                IBM1122()
            }

            "cp1123", "ibm1123", "1123", "xibm1123" -> {
                IBM1123()
            }

            "cp1124", "ibm1124", "1124", "xibm1124" -> {
                IBM1124()
            }

            "cp1129", "ibm1129", "1129", "xibm1129" -> {
                IBM1129()
            }

            "cp1364", "ibm1364", "1364", "xibm1364" -> {
                IBM1364()
            }

            "cp273", "ibm273", "273" -> {
                IBM273()
            }

            "cp277", "ibm277", "277" -> {
                IBM277()
            }

            "cp278", "ibm278", "278", "ebcdicsv", "ebcdiccpse", "csibm278" -> {
                IBM278()
            }

            "cp280", "ibm280", "280" -> {
                IBM280()
            }

            "cp284", "ibm284", "284", "csibm284", "cpibm284" -> {
                IBM284()
            }

            "cp285", "ibm285", "285", "ebcdiccpgb", "ebcdicgb", "csibm285", "cpibm285" -> {
                IBM285()
            }

            "cp297", "ibm297", "297", "ebcdiccpfr", "cpibm297", "csibm297" -> {
                IBM297()
            }

            "cp420", "ibm420", "ebcdiccpar1", "420", "csibm420" -> {
                IBM420()
            }

            "cp424", "ibm424", "424", "ebcdiccphe", "csibm424" -> {
                IBM424()
            }

            "cp500", "ibm500", "500", "ebcdiccpch", "ebcdiccpbh", "csibm500" -> {
                IBM500()
            }

            "cp833", "ibm833", "833", "xibm833" -> {
                IBM833()
            }

            "cp834", "ibm834", "834", "xibm834" -> {
                IBM834()
            }

            "cp838", "ibm838", "838", "ibmthai" -> {
                IBM838()
            }

            "cp870", "ibm870", "870", "ebcdiccproece", "ebcdiccpyu", "csibm870" -> {
                IBM870()
            }

            "cp871", "ibm871", "871", "ebcdiccpis", "csibm871" -> {
                IBM871()
            }

            "cp875", "ibm875", "875", "xibm875" -> {
                IBM875()
            }

            "cp918", "ibm918", "918", "ebcdiccpar2" -> {
                IBM918()
            }

            "cp922", "ibm922", "922", "xibm922" -> {
                IBM922()
            }

            "cp1097", "ibm1097", "1097", "xibm1097" -> {
                IBM1097()
            }

            "cp949", "ibm949", "949", "xibm949" -> {
                IBM949()
            }

            "cp949c", "ibm949c", "949c", "xibm949c" -> {
                IBM949C()
            }

            "cp939", "ibm939", "939", "xibm939" -> {
                IBM939()
            }

            "cp933", "ibm933", "933", "xibm933" -> {
                IBM933()
            }

            "cp1381", "ibm1381", "1381", "xibm1381" -> {
                IBM1381()
            }

            "cp1383", "ibm1383", "1383", "ibmeuccn", "cpeuccn", "xibm1383" -> {
                IBM1383()
            }

            "cp970", "ibm970", "ibmeuckr", "970", "xibm970" -> {
                IBM970()
            }

            "cp964", "ibm964", "ibmeuctw", "964", "xibm964" -> {
                IBM964()
            }

            "cp29626c", "ibm29626c", "29626c", "ibmeucjp", "xibm29626c" -> {
                IBM29626C()
            }

            "cp33722", "ibm33722", "ibm5050", "ibm33722vasciivpua", "33722", "xibm33722" -> {
                IBM33722()
            }

            "cp1140", "ccsid01140", "cp01140", "1140", "ebcdicus037+euro", "ibm1140", "ibm01140" -> {
                IBM1140()
            }

            "cp1141", "ccsid01141", "cp01141", "1141", "ebcdicde273+euro", "ibm1141", "ibm01141" -> {
                IBM1141()
            }

            "cp1142", "ccsid01142", "cp01142", "1142", "ebcdicno277+euro", "ebcdicdk277+euro", "ibm1142", "ibm01142" -> {
                IBM1142()
            }

            "cp1143", "ccsid01143", "cp01143", "1143", "ebcdicfi278+euro", "ebcdicse278+euro", "ibm1143", "ibm01143" -> {
                IBM1143()
            }

            "cp1144", "ccsid01144", "cp01144", "1144", "ebcdicit280+euro", "ibm1144", "ibm01144" -> {
                IBM1144()
            }

            "cp1145", "ccsid01145", "cp01145", "1145", "ebcdices284+euro", "ibm1145", "ibm01145" -> {
                IBM1145()
            }

            "cp1146", "ccsid01146", "cp01146", "1146", "ebcdicgb285+euro", "ibm1146", "ibm01146" -> {
                IBM1146()
            }

            "cp1147", "ccsid01147", "cp01147", "1147", "ebcdicfr277+euro", "ibm1147", "ibm01147" -> {
                IBM1147()
            }

            "cp1148", "ccsid01148", "cp01148", "1148", "ebcdicinternational500+euro", "ibm1148", "ibm01148" -> {
                IBM1148()
            }

            "cp1149", "ccsid01149", "cp01149", "1149", "ebcdics871+euro", "ibm1149", "ibm01149" -> {
                IBM1149()
            }

            "cp290", "ibm290", "csibm290", "ebcdicjpkana", "290" -> {
                IBM290()
            }

            "cp1166", "ibm1166", "1166", "xibm1166" -> {
                IBM1166()
            }

            "cp300", "ibm300", "300", "xibm300" -> {
                IBM300()
            }

            "macroman", "xmacroman" -> {
                MacRoman()
            }

            "maccentraleurope", "xmaccentraleurope" -> {
                MacCentralEurope()
            }

            "maccroatian", "xmaccroatian" -> {
                MacCroatian()
            }

            "macgreek", "xmacgreek" -> {
                MacGreek()
            }

            "maccyrillic", "xmaccyrillic" -> {
                MacCyrillic()
            }

            "macukraine", "xmacukraine" -> {
                MacUkraine()
            }

            "macturkish", "xmacturkish" -> {
                MacTurkish()
            }

            "macarabic", "xmacarabic" -> {
                MacArabic()
            }

            "machebrew", "xmachebrew" -> {
                MacHebrew()
            }

            "maciceland", "xmaciceland" -> {
                MacIceland()
            }

            "macromania", "xmacromania" -> {
                MacRomania()
            }

            "macthai", "xmacthai" -> {
                MacThai()
            }

            "macsymbol", "xmacsymbol" -> {
                MacSymbol()
            }

            "macdingbat", "xmacdingbat" -> {
                MacDingbat()
            }

            else -> null
        }
    }
}