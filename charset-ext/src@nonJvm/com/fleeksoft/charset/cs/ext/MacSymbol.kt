package com.fleeksoft.charset.cs.ext

import com.fleeksoft.charset.Charset
import com.fleeksoft.charset.CharsetDecoder
import com.fleeksoft.charset.CharsetEncoder
import com.fleeksoft.charset.cs.SingleByte
import com.fleeksoft.charset.cs.SingleByte.initC2B


class MacSymbol : Charset("x-MacSymbol", null) {
    

    override fun contains(cs: Charset): Boolean {
        return (cs is MacSymbol)
    }

    override fun newDecoder(): CharsetDecoder {
        return SingleByte.Decoder(this, Holder.b2c, false, false)
    }

    override fun newEncoder(): CharsetEncoder {
        return SingleByte.Encoder(
            this,
            Holder.c2b,
            Holder.c2bIndex,
            false
        )
    }

    private object Holder {
        private const val b2cTable = "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +  // 0x80 - 0x87
                "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +  // 0x88 - 0x8f
                "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +  // 0x90 - 0x97
                "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +  // 0x98 - 0x9f
                "\u20AC\u03D2\u2032\u2264\u2044\u221E\u0192\u2663" +  // 0xa0 - 0xa7
                "\u2666\u2665\u2660\u2194\u2190\u2191\u2192\u2193" +  // 0xa8 - 0xaf
                "\u00B0\u00B1\u2033\u2265\u00D7\u221D\u2202\u2022" +  // 0xb0 - 0xb7
                "\u00F7\u2260\u2261\u2248\u2026\uF8E6\uF8E7\u21B5" +  // 0xb8 - 0xbf
                "\u2135\u2111\u211C\u2118\u2297\u2295\u2205\u2229" +  // 0xc0 - 0xc7
                "\u222A\u2283\u2287\u2284\u2282\u2286\u2208\u2209" +  // 0xc8 - 0xcf
                "\u2220\u2207\u00AE\u00A9\u2122\u220F\u221A\u22C5" +  // 0xd0 - 0xd7
                "\u00AC\u2227\u2228\u21D4\u21D0\u21D1\u21D2\u21D3" +  // 0xd8 - 0xdf
                "\u22C4\u3008\uFFFD\uFFFD\uFFFD\u2211\uFFFD\uFFFD" +  // 0xe0 - 0xe7
                "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uF8F4" +  // 0xe8 - 0xef
                "\uF8FF\u3009\u222B\u2320\uFFFD\u2321\uFFFD\uFFFD" +  // 0xf0 - 0xf7
                "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +  // 0xf8 - 0xff
                "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007" +  // 0x00 - 0x07
                "\b\t\n\u000B\u000c\r\u000E\u000F" +  // 0x08 - 0x0f
                "\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017" +  // 0x10 - 0x17
                "\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F" +  // 0x18 - 0x1f
                "\u0020\u0021\u2200\u0023\u2203\u0025\u0026\u220D" +  // 0x20 - 0x27
                "\u0028\u0029\u2217\u002B\u002C\u2212\u002E\u002F" +  // 0x28 - 0x2f
                "\u0030\u0031\u0032\u0033\u0034\u0035\u0036\u0037" +  // 0x30 - 0x37
                "\u0038\u0039\u003A\u003B\u003C\u003D\u003E\u003F" +  // 0x38 - 0x3f
                "\u2245\u0391\u0392\u03A7\u0394\u0395\u03A6\u0393" +  // 0x40 - 0x47
                "\u0397\u0399\u03D1\u039A\u039B\u039C\u039D\u039F" +  // 0x48 - 0x4f
                "\u03A0\u0398\u03A1\u03A3\u03A4\u03A5\u03C2\u03A9" +  // 0x50 - 0x57
                "\u039E\u03A8\u0396\u005B\u2234\u005D\u22A5\u005F" +  // 0x58 - 0x5f
                "\uF8E5\u03B1\u03B2\u03C7\u03B4\u03B5\u03C6\u03B3" +  // 0x60 - 0x67
                "\u03B7\u03B9\u03D5\u03BA\u03BB\u03BC\u03BD\u03BF" +  // 0x68 - 0x6f
                "\u03C0\u03B8\u03C1\u03C3\u03C4\u03C5\u03D6\u03C9" +  // 0x70 - 0x77
                "\u03BE\u03C8\u03B6\u007B\u007C\u007D\u223C\u007F" // 0x78 - 0x7f


        val b2c = b2cTable.toCharArray()
        val c2b = CharArray(0xb00)
        val c2bIndex = CharArray(0x100)

        init {
            val b2cMap = b2c
            val c2bNR: CharArray? = null
            initC2B(b2cMap, c2bNR, c2b, c2bIndex)
        }
    }
}
