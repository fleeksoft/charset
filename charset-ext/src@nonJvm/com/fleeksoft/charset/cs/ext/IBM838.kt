package com.fleeksoft.charset.cs.ext

import com.fleeksoft.charset.Charset
import com.fleeksoft.charset.CharsetDecoder
import com.fleeksoft.charset.CharsetEncoder
import com.fleeksoft.charset.cs.CharsetMapping
import com.fleeksoft.charset.cs.SingleByte
import com.fleeksoft.charset.cs.SingleByte.initC2B


class IBM838 : Charset("IBM-Thai", null) {

    override fun contains(cs: Charset): Boolean {
        return (cs is IBM838)
    }

    override fun newDecoder(): CharsetDecoder {
        return SingleByte.Decoder(this, Holder.b2c, false, false)
    }

    override fun newEncoder(): CharsetEncoder {
        return SingleByte.Encoder(this, Holder.c2b, Holder.c2bIndex, false)
    }

    private object Holder {
        private const val b2cTable = "\u0E4F\u0061\u0062\u0063\u0064\u0065\u0066\u0067" +  // 0x80 - 0x87
                "\u0068\u0069\u0E1D\u0E1E\u0E1F\u0E20\u0E21\u0E22" +  // 0x88 - 0x8f
                "\u0E5A\u006A\u006B\u006C\u006D\u006E\u006F\u0070" +  // 0x90 - 0x97
                "\u0071\u0072\u0E23\u0E24\u0E25\u0E26\u0E27\u0E28" +  // 0x98 - 0x9f
                "\u0E5B\u007E\u0073\u0074\u0075\u0076\u0077\u0078" +  // 0xa0 - 0xa7
                "\u0079\u007A\u0E29\u0E2A\u0E2B\u0E2C\u0E2D\u0E2E" +  // 0xa8 - 0xaf
                "\u0E50\u0E51\u0E52\u0E53\u0E54\u0E55\u0E56\u0E57" +  // 0xb0 - 0xb7
                "\u0E58\u0E59\u0E2F\u0E30\u0E31\u0E32\u0E33\u0E34" +  // 0xb8 - 0xbf
                "\u007B\u0041\u0042\u0043\u0044\u0045\u0046\u0047" +  // 0xc0 - 0xc7
                "\u0048\u0049\u0E49\u0E35\u0E36\u0E37\u0E38\u0E39" +  // 0xc8 - 0xcf
                "\u007D\u004A\u004B\u004C\u004D\u004E\u004F\u0050" +  // 0xd0 - 0xd7
                "\u0051\u0052\u0E3A\u0E40\u0E41\u0E42\u0E43\u0E44" +  // 0xd8 - 0xdf
                "\\\u0E4A\u0053\u0054\u0055\u0056\u0057\u0058" +  // 0xe0 - 0xe7
                "\u0059\u005A\u0E45\u0E46\u0E47\u0E48\u0E49\u0E4A" +  // 0xe8 - 0xef
                "\u0030\u0031\u0032\u0033\u0034\u0035\u0036\u0037" +  // 0xf0 - 0xf7
                "\u0038\u0039\u0E4B\u0E4C\u0E4D\u0E4B\u0E4C\u009F" +  // 0xf8 - 0xff
                "\u0000\u0001\u0002\u0003\u009C\t\u0086\u007F" +  // 0x00 - 0x07
                "\u0097\u008D\u008E\u000B\u000c\r\u000E\u000F" +  // 0x08 - 0x0f
                "\u0010\u0011\u0012\u0013\u009D\n\b\u0087" +  // 0x10 - 0x17
                "\u0018\u0019\u0092\u008F\u001C\u001D\u001E\u001F" +  // 0x18 - 0x1f
                "\u0080\u0081\u0082\u0083\u0084\n\u0017\u001B" +  // 0x20 - 0x27
                "\u0088\u0089\u008A\u008B\u008C\u0005\u0006\u0007" +  // 0x28 - 0x2f
                "\u0090\u0091\u0016\u0093\u0094\u0095\u0096\u0004" +  // 0x30 - 0x37
                "\u0098\u0099\u009A\u009B\u0014\u0015\u009E\u001A" +  // 0x38 - 0x3f
                "\u0020\u00A0\u0E01\u0E02\u0E03\u0E04\u0E05\u0E06" +  // 0x40 - 0x47
                "\u0E07\u005B\u00A2\u002E\u003C\u0028\u002B\u007C" +  // 0x48 - 0x4f
                "\u0026\u0E48\u0E08\u0E09\u0E0A\u0E0B\u0E0C\u0E0D" +  // 0x50 - 0x57
                "\u0E0E\u005D\u0021\u0024\u002A\u0029\u003B\u00AC" +  // 0x58 - 0x5f
                "\u002D\u002F\u0E0F\u0E10\u0E11\u0E12\u0E13\u0E14" +  // 0x60 - 0x67
                "\u0E15\u005E\u00A6\u002C\u0025\u005F\u003E\u003F" +  // 0x68 - 0x6f
                "\u0E3F\u0E4E\u0E16\u0E17\u0E18\u0E19\u0E1A\u0E1B" +  // 0x70 - 0x77
                "\u0E1C\u0060\u003A\u0023\u0040\'\u003D\"" // 0x78 - 0x7f


        val b2c = b2cTable.toCharArray()
        val c2b = CharArray(0x200)
        val c2bIndex = CharArray(0x100)

        init {
            var b2cMap = b2c
            var c2bNR: CharArray? = null
            // remove non-roundtrip entries
            b2cMap = b2cTable.toCharArray()
            b2cMap[165] = CharsetMapping.UNMAPPABLE_DECODING
            b2cMap[209] = CharsetMapping.UNMAPPABLE_DECODING
            b2cMap[74] = CharsetMapping.UNMAPPABLE_DECODING
            b2cMap[97] = CharsetMapping.UNMAPPABLE_DECODING
            b2cMap[125] = CharsetMapping.UNMAPPABLE_DECODING
            b2cMap[126] = CharsetMapping.UNMAPPABLE_DECODING

            // non-roundtrip c2b only entries
            c2bNR = CharArray(2)
            c2bNR[0] = 0x15.toChar()
            c2bNR[1] = 0x85.toChar()

            initC2B(b2cMap, c2bNR, c2b, c2bIndex)
        }
    }
}
