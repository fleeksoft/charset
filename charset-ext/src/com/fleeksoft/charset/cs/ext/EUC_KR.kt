package com.fleeksoft.charset.cs.ext

import com.fleeksoft.charset.Charset
import com.fleeksoft.charset.CharsetDecoder
import com.fleeksoft.charset.CharsetEncoder
import com.fleeksoft.charset.cs.DoubleByte

class EUC_KR() : Charset("EUC-KR") {

    override fun newDecoder(): CharsetDecoder = DoubleByte.Decoder(this, DecodeHolder.b2c, DecodeHolder.b2cSB, 0xa1, 0xfe, true)
    override fun newEncoder(): CharsetEncoder = DoubleByte.Encoder(this, EncodeHolder.c2b, EncodeHolder.c2bIndex, true)

    companion object {

        val INSTANCE = EUC_KR()

        internal object DecodeHolder {
            val b2cSBStr = "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007" +
                    "\b\t\n\u000B\u000c\r\u000E\u000F" +
                    "\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017" +
                    "\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F" +
                    "\u0020\u0021\"\u0023\u0024\u0025\u0026\'" +
                    "\u0028\u0029\u002A\u002B\u002C\u002D\u002E\u002F" +
                    "\u0030\u0031\u0032\u0033\u0034\u0035\u0036\u0037" +
                    "\u0038\u0039\u003A\u003B\u003C\u003D\u003E\u003F" +
                    "\u0040\u0041\u0042\u0043\u0044\u0045\u0046\u0047" +
                    "\u0048\u0049\u004A\u004B\u004C\u004D\u004E\u004F" +
                    "\u0050\u0051\u0052\u0053\u0054\u0055\u0056\u0057" +
                    "\u0058\u0059\u005A\u005B\\\u005D\u005E\u005F" +
                    "\u0060\u0061\u0062\u0063\u0064\u0065\u0066\u0067" +
                    "\u0068\u0069\u006A\u006B\u006C\u006D\u006E\u006F" +
                    "\u0070\u0071\u0072\u0073\u0074\u0075\u0076\u0077" +
                    "\u0078\u0079\u007A\u007B\u007C\u007D\u007E\u007F" +
                    "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                    "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                    "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                    "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                    "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                    "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                    "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                    "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                    "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                    "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                    "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                    "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                    "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                    "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                    "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                    "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"

            val b2cStr: Array<String?> = arrayOf(
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "\u3000\u3001\u3002\u00B7\u2025\u2026\u00A8\u3003" +
                        "\u00AD\u2015\u2225\uFF3C\u223C\u2018\u2019\u201C" +
                        "\u201D\u3014\u3015\u3008\u3009\u300A\u300B\u300C" +
                        "\u300D\u300E\u300F\u3010\u3011\u00B1\u00D7\u00F7" +
                        "\u2260\u2264\u2265\u221E\u2234\u00B0\u2032\u2033" +
                        "\u2103\u212B\uFFE0\uFFE1\uFFE5\u2642\u2640\u2220" +
                        "\u22A5\u2312\u2202\u2207\u2261\u2252\u00A7\u203B" +
                        "\u2606\u2605\u25CB\u25CF\u25CE\u25C7\u25C6\u25A1" +
                        "\u25A0\u25B3\u25B2\u25BD\u25BC\u2192\u2190\u2191" +
                        "\u2193\u2194\u3013\u226A\u226B\u221A\u223D\u221D" +
                        "\u2235\u222B\u222C\u2208\u220B\u2286\u2287\u2282" +
                        "\u2283\u222A\u2229\u2227\u2228\uFFE2",
                "\u21D2\u21D4\u2200\u2203\u00B4\uFF5E\u02C7\u02D8" +
                        "\u02DD\u02DA\u02D9\u00B8\u02DB\u00A1\u00BF\u02D0" +
                        "\u222E\u2211\u220F\u00A4\u2109\u2030\u25C1\u25C0" +
                        "\u25B7\u25B6\u2664\u2660\u2661\u2665\u2667\u2663" +
                        "\u2299\u25C8\u25A3\u25D0\u25D1\u2592\u25A4\u25A5" +
                        "\u25A8\u25A7\u25A6\u25A9\u2668\u260F\u260E\u261C" +
                        "\u261E\u00B6\u2020\u2021\u2195\u2197\u2199\u2196" +
                        "\u2198\u266D\u2669\u266A\u266C\u327F\u321C\u2116" +
                        "\u33C7\u2122\u33C2\u33D8\u2121\u20AC\u00AE\u327E" +
                        "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                        "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                        "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD",
                "\uFF01\uFF02\uFF03\uFF04\uFF05\uFF06\uFF07\uFF08" +
                        "\uFF09\uFF0A\uFF0B\uFF0C\uFF0D\uFF0E\uFF0F\uFF10" +
                        "\uFF11\uFF12\uFF13\uFF14\uFF15\uFF16\uFF17\uFF18" +
                        "\uFF19\uFF1A\uFF1B\uFF1C\uFF1D\uFF1E\uFF1F\uFF20" +
                        "\uFF21\uFF22\uFF23\uFF24\uFF25\uFF26\uFF27\uFF28" +
                        "\uFF29\uFF2A\uFF2B\uFF2C\uFF2D\uFF2E\uFF2F\uFF30" +
                        "\uFF31\uFF32\uFF33\uFF34\uFF35\uFF36\uFF37\uFF38" +
                        "\uFF39\uFF3A\uFF3B\uFFE6\uFF3D\uFF3E\uFF3F\uFF40" +
                        "\uFF41\uFF42\uFF43\uFF44\uFF45\uFF46\uFF47\uFF48" +
                        "\uFF49\uFF4A\uFF4B\uFF4C\uFF4D\uFF4E\uFF4F\uFF50" +
                        "\uFF51\uFF52\uFF53\uFF54\uFF55\uFF56\uFF57\uFF58" +
                        "\uFF59\uFF5A\uFF5B\uFF5C\uFF5D\uFFE3",
                "\u3131\u3132\u3133\u3134\u3135\u3136\u3137\u3138" +
                        "\u3139\u313A\u313B\u313C\u313D\u313E\u313F\u3140" +
                        "\u3141\u3142\u3143\u3144\u3145\u3146\u3147\u3148" +
                        "\u3149\u314A\u314B\u314C\u314D\u314E\u314F\u3150" +
                        "\u3151\u3152\u3153\u3154\u3155\u3156\u3157\u3158" +
                        "\u3159\u315A\u315B\u315C\u315D\u315E\u315F\u3160" +
                        "\u3161\u3162\u3163\u3164\u3165\u3166\u3167\u3168" +
                        "\u3169\u316A\u316B\u316C\u316D\u316E\u316F\u3170" +
                        "\u3171\u3172\u3173\u3174\u3175\u3176\u3177\u3178" +
                        "\u3179\u317A\u317B\u317C\u317D\u317E\u317F\u3180" +
                        "\u3181\u3182\u3183\u3184\u3185\u3186\u3187\u3188" +
                        "\u3189\u318A\u318B\u318C\u318D\u318E",
                "\u2170\u2171\u2172\u2173\u2174\u2175\u2176\u2177" +
                        "\u2178\u2179\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u2160" +
                        "\u2161\u2162\u2163\u2164\u2165\u2166\u2167\u2168" +
                        "\u2169\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                        "\u0391\u0392\u0393\u0394\u0395\u0396\u0397\u0398" +
                        "\u0399\u039A\u039B\u039C\u039D\u039E\u039F\u03A0" +
                        "\u03A1\u03A3\u03A4\u03A5\u03A6\u03A7\u03A8\u03A9" +
                        "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                        "\u03B1\u03B2\u03B3\u03B4\u03B5\u03B6\u03B7\u03B8" +
                        "\u03B9\u03BA\u03BB\u03BC\u03BD\u03BE\u03BF\u03C0" +
                        "\u03C1\u03C3\u03C4\u03C5\u03C6\u03C7\u03C8\u03C9" +
                        "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD",
                "\u2500\u2502\u250C\u2510\u2518\u2514\u251C\u252C" +
                        "\u2524\u2534\u253C\u2501\u2503\u250F\u2513\u251B" +
                        "\u2517\u2523\u2533\u252B\u253B\u254B\u2520\u252F" +
                        "\u2528\u2537\u253F\u251D\u2530\u2525\u2538\u2542" +
                        "\u2512\u2511\u251A\u2519\u2516\u2515\u250E\u250D" +
                        "\u251E\u251F\u2521\u2522\u2526\u2527\u2529\u252A" +
                        "\u252D\u252E\u2531\u2532\u2535\u2536\u2539\u253A" +
                        "\u253D\u253E\u2540\u2541\u2543\u2544\u2545\u2546" +
                        "\u2547\u2548\u2549\u254A\uFFFD\uFFFD\uFFFD\uFFFD" +
                        "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                        "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                        "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD",
                "\u3395\u3396\u3397\u2113\u3398\u33C4\u33A3\u33A4" +
                        "\u33A5\u33A6\u3399\u339A\u339B\u339C\u339D\u339E" +
                        "\u339F\u33A0\u33A1\u33A2\u33CA\u338D\u338E\u338F" +
                        "\u33CF\u3388\u3389\u33C8\u33A7\u33A8\u33B0\u33B1" +
                        "\u33B2\u33B3\u33B4\u33B5\u33B6\u33B7\u33B8\u33B9" +
                        "\u3380\u3381\u3382\u3383\u3384\u33BA\u33BB\u33BC" +
                        "\u33BD\u33BE\u33BF\u3390\u3391\u3392\u3393\u3394" +
                        "\u2126\u33C0\u33C1\u338A\u338B\u338C\u33D6\u33C5" +
                        "\u33AD\u33AE\u33AF\u33DB\u33A9\u33AA\u33AB\u33AC" +
                        "\u33DD\u33D0\u33D3\u33C3\u33C9\u33DC\u33C6\uFFFD" +
                        "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                        "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD",
                "\u00C6\u00D0\u00AA\u0126\uFFFD\u0132\uFFFD\u013F" +
                        "\u0141\u00D8\u0152\u00BA\u00DE\u0166\u014A\uFFFD" +
                        "\u3260\u3261\u3262\u3263\u3264\u3265\u3266\u3267" +
                        "\u3268\u3269\u326A\u326B\u326C\u326D\u326E\u326F" +
                        "\u3270\u3271\u3272\u3273\u3274\u3275\u3276\u3277" +
                        "\u3278\u3279\u327A\u327B\u24D0\u24D1\u24D2\u24D3" +
                        "\u24D4\u24D5\u24D6\u24D7\u24D8\u24D9\u24DA\u24DB" +
                        "\u24DC\u24DD\u24DE\u24DF\u24E0\u24E1\u24E2\u24E3" +
                        "\u24E4\u24E5\u24E6\u24E7\u24E8\u24E9\u2460\u2461" +
                        "\u2462\u2463\u2464\u2465\u2466\u2467\u2468\u2469" +
                        "\u246A\u246B\u246C\u246D\u246E\u00BD\u2153\u2154" +
                        "\u00BC\u00BE\u215B\u215C\u215D\u215E",
                "\u00E6\u0111\u00F0\u0127\u0131\u0133\u0138\u0140" +
                        "\u0142\u00F8\u0153\u00DF\u00FE\u0167\u014B\u0149" +
                        "\u3200\u3201\u3202\u3203\u3204\u3205\u3206\u3207" +
                        "\u3208\u3209\u320A\u320B\u320C\u320D\u320E\u320F" +
                        "\u3210\u3211\u3212\u3213\u3214\u3215\u3216\u3217" +
                        "\u3218\u3219\u321A\u321B\u249C\u249D\u249E\u249F" +
                        "\u24A0\u24A1\u24A2\u24A3\u24A4\u24A5\u24A6\u24A7" +
                        "\u24A8\u24A9\u24AA\u24AB\u24AC\u24AD\u24AE\u24AF" +
                        "\u24B0\u24B1\u24B2\u24B3\u24B4\u24B5\u2474\u2475" +
                        "\u2476\u2477\u2478\u2479\u247A\u247B\u247C\u247D" +
                        "\u247E\u247F\u2480\u2481\u2482\u00B9\u00B2\u00B3" +
                        "\u2074\u207F\u2081\u2082\u2083\u2084",
                "\u3041\u3042\u3043\u3044\u3045\u3046\u3047\u3048" +
                        "\u3049\u304A\u304B\u304C\u304D\u304E\u304F\u3050" +
                        "\u3051\u3052\u3053\u3054\u3055\u3056\u3057\u3058" +
                        "\u3059\u305A\u305B\u305C\u305D\u305E\u305F\u3060" +
                        "\u3061\u3062\u3063\u3064\u3065\u3066\u3067\u3068" +
                        "\u3069\u306A\u306B\u306C\u306D\u306E\u306F\u3070" +
                        "\u3071\u3072\u3073\u3074\u3075\u3076\u3077\u3078" +
                        "\u3079\u307A\u307B\u307C\u307D\u307E\u307F\u3080" +
                        "\u3081\u3082\u3083\u3084\u3085\u3086\u3087\u3088" +
                        "\u3089\u308A\u308B\u308C\u308D\u308E\u308F\u3090" +
                        "\u3091\u3092\u3093\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                        "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD",
                "\u30A1\u30A2\u30A3\u30A4\u30A5\u30A6\u30A7\u30A8" +
                        "\u30A9\u30AA\u30AB\u30AC\u30AD\u30AE\u30AF\u30B0" +
                        "\u30B1\u30B2\u30B3\u30B4\u30B5\u30B6\u30B7\u30B8" +
                        "\u30B9\u30BA\u30BB\u30BC\u30BD\u30BE\u30BF\u30C0" +
                        "\u30C1\u30C2\u30C3\u30C4\u30C5\u30C6\u30C7\u30C8" +
                        "\u30C9\u30CA\u30CB\u30CC\u30CD\u30CE\u30CF\u30D0" +
                        "\u30D1\u30D2\u30D3\u30D4\u30D5\u30D6\u30D7\u30D8" +
                        "\u30D9\u30DA\u30DB\u30DC\u30DD\u30DE\u30DF\u30E0" +
                        "\u30E1\u30E2\u30E3\u30E4\u30E5\u30E6\u30E7\u30E8" +
                        "\u30E9\u30EA\u30EB\u30EC\u30ED\u30EE\u30EF\u30F0" +
                        "\u30F1\u30F2\u30F3\u30F4\u30F5\u30F6\uFFFD\uFFFD" +
                        "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD",
                "\u0410\u0411\u0412\u0413\u0414\u0415\u0401\u0416" +
                        "\u0417\u0418\u0419\u041A\u041B\u041C\u041D\u041E" +
                        "\u041F\u0420\u0421\u0422\u0423\u0424\u0425\u0426" +
                        "\u0427\u0428\u0429\u042A\u042B\u042C\u042D\u042E" +
                        "\u042F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                        "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                        "\u0430\u0431\u0432\u0433\u0434\u0435\u0451\u0436" +
                        "\u0437\u0438\u0439\u043A\u043B\u043C\u043D\u043E" +
                        "\u043F\u0440\u0441\u0442\u0443\u0444\u0445\u0446" +
                        "\u0447\u0448\u0449\u044A\u044B\u044C\u044D\u044E" +
                        "\u044F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD" +
                        "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD",
                null,
                null,
                null,
                "\uAC00\uAC01\uAC04\uAC07\uAC08\uAC09\uAC0A\uAC10" +
                        "\uAC11\uAC12\uAC13\uAC14\uAC15\uAC16\uAC17\uAC19" +
                        "\uAC1A\uAC1B\uAC1C\uAC1D\uAC20\uAC24\uAC2C\uAC2D" +
                        "\uAC2F\uAC30\uAC31\uAC38\uAC39\uAC3C\uAC40\uAC4B" +
                        "\uAC4D\uAC54\uAC58\uAC5C\uAC70\uAC71\uAC74\uAC77" +
                        "\uAC78\uAC7A\uAC80\uAC81\uAC83\uAC84\uAC85\uAC86" +
                        "\uAC89\uAC8A\uAC8B\uAC8C\uAC90\uAC94\uAC9C\uAC9D" +
                        "\uAC9F\uACA0\uACA1\uACA8\uACA9\uACAA\uACAC\uACAF" +
                        "\uACB0\uACB8\uACB9\uACBB\uACBC\uACBD\uACC1\uACC4" +
                        "\uACC8\uACCC\uACD5\uACD7\uACE0\uACE1\uACE4\uACE7" +
                        "\uACE8\uACEA\uACEC\uACEF\uACF0\uACF1\uACF3\uACF5" +
                        "\uACF6\uACFC\uACFD\uAD00\uAD04\uAD06",
                "\uAD0C\uAD0D\uAD0F\uAD11\uAD18\uAD1C\uAD20\uAD29" +
                        "\uAD2C\uAD2D\uAD34\uAD35\uAD38\uAD3C\uAD44\uAD45" +
                        "\uAD47\uAD49\uAD50\uAD54\uAD58\uAD61\uAD63\uAD6C" +
                        "\uAD6D\uAD70\uAD73\uAD74\uAD75\uAD76\uAD7B\uAD7C" +
                        "\uAD7D\uAD7F\uAD81\uAD82\uAD88\uAD89\uAD8C\uAD90" +
                        "\uAD9C\uAD9D\uADA4\uADB7\uADC0\uADC1\uADC4\uADC8" +
                        "\uADD0\uADD1\uADD3\uADDC\uADE0\uADE4\uADF8\uADF9" +
                        "\uADFC\uADFF\uAE00\uAE01\uAE08\uAE09\uAE0B\uAE0D" +
                        "\uAE14\uAE30\uAE31\uAE34\uAE37\uAE38\uAE3A\uAE40" +
                        "\uAE41\uAE43\uAE45\uAE46\uAE4A\uAE4C\uAE4D\uAE4E" +
                        "\uAE50\uAE54\uAE56\uAE5C\uAE5D\uAE5F\uAE60\uAE61" +
                        "\uAE65\uAE68\uAE69\uAE6C\uAE70\uAE78",
                "\uAE79\uAE7B\uAE7C\uAE7D\uAE84\uAE85\uAE8C\uAEBC" +
                        "\uAEBD\uAEBE\uAEC0\uAEC4\uAECC\uAECD\uAECF\uAED0" +
                        "\uAED1\uAED8\uAED9\uAEDC\uAEE8\uAEEB\uAEED\uAEF4" +
                        "\uAEF8\uAEFC\uAF07\uAF08\uAF0D\uAF10\uAF2C\uAF2D" +
                        "\uAF30\uAF32\uAF34\uAF3C\uAF3D\uAF3F\uAF41\uAF42" +
                        "\uAF43\uAF48\uAF49\uAF50\uAF5C\uAF5D\uAF64\uAF65" +
                        "\uAF79\uAF80\uAF84\uAF88\uAF90\uAF91\uAF95\uAF9C" +
                        "\uAFB8\uAFB9\uAFBC\uAFC0\uAFC7\uAFC8\uAFC9\uAFCB" +
                        "\uAFCD\uAFCE\uAFD4\uAFDC\uAFE8\uAFE9\uAFF0\uAFF1" +
                        "\uAFF4\uAFF8\uB000\uB001\uB004\uB00C\uB010\uB014" +
                        "\uB01C\uB01D\uB028\uB044\uB045\uB048\uB04A\uB04C" +
                        "\uB04E\uB053\uB054\uB055\uB057\uB059",
                "\uB05D\uB07C\uB07D\uB080\uB084\uB08C\uB08D\uB08F" +
                        "\uB091\uB098\uB099\uB09A\uB09C\uB09F\uB0A0\uB0A1" +
                        "\uB0A2\uB0A8\uB0A9\uB0AB\uB0AC\uB0AD\uB0AE\uB0AF" +
                        "\uB0B1\uB0B3\uB0B4\uB0B5\uB0B8\uB0BC\uB0C4\uB0C5" +
                        "\uB0C7\uB0C8\uB0C9\uB0D0\uB0D1\uB0D4\uB0D8\uB0E0" +
                        "\uB0E5\uB108\uB109\uB10B\uB10C\uB110\uB112\uB113" +
                        "\uB118\uB119\uB11B\uB11C\uB11D\uB123\uB124\uB125" +
                        "\uB128\uB12C\uB134\uB135\uB137\uB138\uB139\uB140" +
                        "\uB141\uB144\uB148\uB150\uB151\uB154\uB155\uB158" +
                        "\uB15C\uB160\uB178\uB179\uB17C\uB180\uB182\uB188" +
                        "\uB189\uB18B\uB18D\uB192\uB193\uB194\uB198\uB19C" +
                        "\uB1A8\uB1CC\uB1D0\uB1D4\uB1DC\uB1DD",
                "\uB1DF\uB1E8\uB1E9\uB1EC\uB1F0\uB1F9\uB1FB\uB1FD" +
                        "\uB204\uB205\uB208\uB20B\uB20C\uB214\uB215\uB217" +
                        "\uB219\uB220\uB234\uB23C\uB258\uB25C\uB260\uB268" +
                        "\uB269\uB274\uB275\uB27C\uB284\uB285\uB289\uB290" +
                        "\uB291\uB294\uB298\uB299\uB29A\uB2A0\uB2A1\uB2A3" +
                        "\uB2A5\uB2A6\uB2AA\uB2AC\uB2B0\uB2B4\uB2C8\uB2C9" +
                        "\uB2CC\uB2D0\uB2D2\uB2D8\uB2D9\uB2DB\uB2DD\uB2E2" +
                        "\uB2E4\uB2E5\uB2E6\uB2E8\uB2EB\uB2EC\uB2ED\uB2EE" +
                        "\uB2EF\uB2F3\uB2F4\uB2F5\uB2F7\uB2F8\uB2F9\uB2FA" +
                        "\uB2FB\uB2FF\uB300\uB301\uB304\uB308\uB310\uB311" +
                        "\uB313\uB314\uB315\uB31C\uB354\uB355\uB356\uB358" +
                        "\uB35B\uB35C\uB35E\uB35F\uB364\uB365",
                "\uB367\uB369\uB36B\uB36E\uB370\uB371\uB374\uB378" +
                        "\uB380\uB381\uB383\uB384\uB385\uB38C\uB390\uB394" +
                        "\uB3A0\uB3A1\uB3A8\uB3AC\uB3C4\uB3C5\uB3C8\uB3CB" +
                        "\uB3CC\uB3CE\uB3D0\uB3D4\uB3D5\uB3D7\uB3D9\uB3DB" +
                        "\uB3DD\uB3E0\uB3E4\uB3E8\uB3FC\uB410\uB418\uB41C" +
                        "\uB420\uB428\uB429\uB42B\uB434\uB450\uB451\uB454" +
                        "\uB458\uB460\uB461\uB463\uB465\uB46C\uB480\uB488" +
                        "\uB49D\uB4A4\uB4A8\uB4AC\uB4B5\uB4B7\uB4B9\uB4C0" +
                        "\uB4C4\uB4C8\uB4D0\uB4D5\uB4DC\uB4DD\uB4E0\uB4E3" +
                        "\uB4E4\uB4E6\uB4EC\uB4ED\uB4EF\uB4F1\uB4F8\uB514" +
                        "\uB515\uB518\uB51B\uB51C\uB524\uB525\uB527\uB528" +
                        "\uB529\uB52A\uB530\uB531\uB534\uB538",
                "\uB540\uB541\uB543\uB544\uB545\uB54B\uB54C\uB54D" +
                        "\uB550\uB554\uB55C\uB55D\uB55F\uB560\uB561\uB5A0" +
                        "\uB5A1\uB5A4\uB5A8\uB5AA\uB5AB\uB5B0\uB5B1\uB5B3" +
                        "\uB5B4\uB5B5\uB5BB\uB5BC\uB5BD\uB5C0\uB5C4\uB5CC" +
                        "\uB5CD\uB5CF\uB5D0\uB5D1\uB5D8\uB5EC\uB610\uB611" +
                        "\uB614\uB618\uB625\uB62C\uB634\uB648\uB664\uB668" +
                        "\uB69C\uB69D\uB6A0\uB6A4\uB6AB\uB6AC\uB6B1\uB6D4" +
                        "\uB6F0\uB6F4\uB6F8\uB700\uB701\uB705\uB728\uB729" +
                        "\uB72C\uB72F\uB730\uB738\uB739\uB73B\uB744\uB748" +
                        "\uB74C\uB754\uB755\uB760\uB764\uB768\uB770\uB771" +
                        "\uB773\uB775\uB77C\uB77D\uB780\uB784\uB78C\uB78D" +
                        "\uB78F\uB790\uB791\uB792\uB796\uB797",
                "\uB798\uB799\uB79C\uB7A0\uB7A8\uB7A9\uB7AB\uB7AC" +
                        "\uB7AD\uB7B4\uB7B5\uB7B8\uB7C7\uB7C9\uB7EC\uB7ED" +
                        "\uB7F0\uB7F4\uB7FC\uB7FD\uB7FF\uB800\uB801\uB807" +
                        "\uB808\uB809\uB80C\uB810\uB818\uB819\uB81B\uB81D" +
                        "\uB824\uB825\uB828\uB82C\uB834\uB835\uB837\uB838" +
                        "\uB839\uB840\uB844\uB851\uB853\uB85C\uB85D\uB860" +
                        "\uB864\uB86C\uB86D\uB86F\uB871\uB878\uB87C\uB88D" +
                        "\uB8A8\uB8B0\uB8B4\uB8B8\uB8C0\uB8C1\uB8C3\uB8C5" +
                        "\uB8CC\uB8D0\uB8D4\uB8DD\uB8DF\uB8E1\uB8E8\uB8E9" +
                        "\uB8EC\uB8F0\uB8F8\uB8F9\uB8FB\uB8FD\uB904\uB918" +
                        "\uB920\uB93C\uB93D\uB940\uB944\uB94C\uB94F\uB951" +
                        "\uB958\uB959\uB95C\uB960\uB968\uB969",
                "\uB96B\uB96D\uB974\uB975\uB978\uB97C\uB984\uB985" +
                        "\uB987\uB989\uB98A\uB98D\uB98E\uB9AC\uB9AD\uB9B0" +
                        "\uB9B4\uB9BC\uB9BD\uB9BF\uB9C1\uB9C8\uB9C9\uB9CC" +
                        "\uB9CE\uB9CF\uB9D0\uB9D1\uB9D2\uB9D8\uB9D9\uB9DB" +
                        "\uB9DD\uB9DE\uB9E1\uB9E3\uB9E4\uB9E5\uB9E8\uB9EC" +
                        "\uB9F4\uB9F5\uB9F7\uB9F8\uB9F9\uB9FA\uBA00\uBA01" +
                        "\uBA08\uBA15\uBA38\uBA39\uBA3C\uBA40\uBA42\uBA48" +
                        "\uBA49\uBA4B\uBA4D\uBA4E\uBA53\uBA54\uBA55\uBA58" +
                        "\uBA5C\uBA64\uBA65\uBA67\uBA68\uBA69\uBA70\uBA71" +
                        "\uBA74\uBA78\uBA83\uBA84\uBA85\uBA87\uBA8C\uBAA8" +
                        "\uBAA9\uBAAB\uBAAC\uBAB0\uBAB2\uBAB8\uBAB9\uBABB" +
                        "\uBABD\uBAC4\uBAC8\uBAD8\uBAD9\uBAFC",
                "\uBB00\uBB04\uBB0D\uBB0F\uBB11\uBB18\uBB1C\uBB20" +
                        "\uBB29\uBB2B\uBB34\uBB35\uBB36\uBB38\uBB3B\uBB3C" +
                        "\uBB3D\uBB3E\uBB44\uBB45\uBB47\uBB49\uBB4D\uBB4F" +
                        "\uBB50\uBB54\uBB58\uBB61\uBB63\uBB6C\uBB88\uBB8C" +
                        "\uBB90\uBBA4\uBBA8\uBBAC\uBBB4\uBBB7\uBBC0\uBBC4" +
                        "\uBBC8\uBBD0\uBBD3\uBBF8\uBBF9\uBBFC\uBBFF\uBC00" +
                        "\uBC02\uBC08\uBC09\uBC0B\uBC0C\uBC0D\uBC0F\uBC11" +
                        "\uBC14\uBC15\uBC16\uBC17\uBC18\uBC1B\uBC1C\uBC1D" +
                        "\uBC1E\uBC1F\uBC24\uBC25\uBC27\uBC29\uBC2D\uBC30" +
                        "\uBC31\uBC34\uBC38\uBC40\uBC41\uBC43\uBC44\uBC45" +
                        "\uBC49\uBC4C\uBC4D\uBC50\uBC5D\uBC84\uBC85\uBC88" +
                        "\uBC8B\uBC8C\uBC8E\uBC94\uBC95\uBC97",
                "\uBC99\uBC9A\uBCA0\uBCA1\uBCA4\uBCA7\uBCA8\uBCB0" +
                        "\uBCB1\uBCB3\uBCB4\uBCB5\uBCBC\uBCBD\uBCC0\uBCC4" +
                        "\uBCCD\uBCCF\uBCD0\uBCD1\uBCD5\uBCD8\uBCDC\uBCF4" +
                        "\uBCF5\uBCF6\uBCF8\uBCFC\uBD04\uBD05\uBD07\uBD09" +
                        "\uBD10\uBD14\uBD24\uBD2C\uBD40\uBD48\uBD49\uBD4C" +
                        "\uBD50\uBD58\uBD59\uBD64\uBD68\uBD80\uBD81\uBD84" +
                        "\uBD87\uBD88\uBD89\uBD8A\uBD90\uBD91\uBD93\uBD95" +
                        "\uBD99\uBD9A\uBD9C\uBDA4\uBDB0\uBDB8\uBDD4\uBDD5" +
                        "\uBDD8\uBDDC\uBDE9\uBDF0\uBDF4\uBDF8\uBE00\uBE03" +
                        "\uBE05\uBE0C\uBE0D\uBE10\uBE14\uBE1C\uBE1D\uBE1F" +
                        "\uBE44\uBE45\uBE48\uBE4C\uBE4E\uBE54\uBE55\uBE57" +
                        "\uBE59\uBE5A\uBE5B\uBE60\uBE61\uBE64",
                "\uBE68\uBE6A\uBE70\uBE71\uBE73\uBE74\uBE75\uBE7B" +
                        "\uBE7C\uBE7D\uBE80\uBE84\uBE8C\uBE8D\uBE8F\uBE90" +
                        "\uBE91\uBE98\uBE99\uBEA8\uBED0\uBED1\uBED4\uBED7" +
                        "\uBED8\uBEE0\uBEE3\uBEE4\uBEE5\uBEEC\uBF01\uBF08" +
                        "\uBF09\uBF18\uBF19\uBF1B\uBF1C\uBF1D\uBF40\uBF41" +
                        "\uBF44\uBF48\uBF50\uBF51\uBF55\uBF94\uBFB0\uBFC5" +
                        "\uBFCC\uBFCD\uBFD0\uBFD4\uBFDC\uBFDF\uBFE1\uC03C" +
                        "\uC051\uC058\uC05C\uC060\uC068\uC069\uC090\uC091" +
                        "\uC094\uC098\uC0A0\uC0A1\uC0A3\uC0A5\uC0AC\uC0AD" +
                        "\uC0AF\uC0B0\uC0B3\uC0B4\uC0B5\uC0B6\uC0BC\uC0BD" +
                        "\uC0BF\uC0C0\uC0C1\uC0C5\uC0C8\uC0C9\uC0CC\uC0D0" +
                        "\uC0D8\uC0D9\uC0DB\uC0DC\uC0DD\uC0E4",
                "\uC0E5\uC0E8\uC0EC\uC0F4\uC0F5\uC0F7\uC0F9\uC100" +
                        "\uC104\uC108\uC110\uC115\uC11C\uC11D\uC11E\uC11F" +
                        "\uC120\uC123\uC124\uC126\uC127\uC12C\uC12D\uC12F" +
                        "\uC130\uC131\uC136\uC138\uC139\uC13C\uC140\uC148" +
                        "\uC149\uC14B\uC14C\uC14D\uC154\uC155\uC158\uC15C" +
                        "\uC164\uC165\uC167\uC168\uC169\uC170\uC174\uC178" +
                        "\uC185\uC18C\uC18D\uC18E\uC190\uC194\uC196\uC19C" +
                        "\uC19D\uC19F\uC1A1\uC1A5\uC1A8\uC1A9\uC1AC\uC1B0" +
                        "\uC1BD\uC1C4\uC1C8\uC1CC\uC1D4\uC1D7\uC1D8\uC1E0" +
                        "\uC1E4\uC1E8\uC1F0\uC1F1\uC1F3\uC1FC\uC1FD\uC200" +
                        "\uC204\uC20C\uC20D\uC20F\uC211\uC218\uC219\uC21C" +
                        "\uC21F\uC220\uC228\uC229\uC22B\uC22D",
                "\uC22F\uC231\uC232\uC234\uC248\uC250\uC251\uC254" +
                        "\uC258\uC260\uC265\uC26C\uC26D\uC270\uC274\uC27C" +
                        "\uC27D\uC27F\uC281\uC288\uC289\uC290\uC298\uC29B" +
                        "\uC29D\uC2A4\uC2A5\uC2A8\uC2AC\uC2AD\uC2B4\uC2B5" +
                        "\uC2B7\uC2B9\uC2DC\uC2DD\uC2E0\uC2E3\uC2E4\uC2EB" +
                        "\uC2EC\uC2ED\uC2EF\uC2F1\uC2F6\uC2F8\uC2F9\uC2FB" +
                        "\uC2FC\uC300\uC308\uC309\uC30C\uC30D\uC313\uC314" +
                        "\uC315\uC318\uC31C\uC324\uC325\uC328\uC329\uC345" +
                        "\uC368\uC369\uC36C\uC370\uC372\uC378\uC379\uC37C" +
                        "\uC37D\uC384\uC388\uC38C\uC3C0\uC3D8\uC3D9\uC3DC" +
                        "\uC3DF\uC3E0\uC3E2\uC3E8\uC3E9\uC3ED\uC3F4\uC3F5" +
                        "\uC3F8\uC408\uC410\uC424\uC42C\uC430",
                "\uC434\uC43C\uC43D\uC448\uC464\uC465\uC468\uC46C" +
                        "\uC474\uC475\uC479\uC480\uC494\uC49C\uC4B8\uC4BC" +
                        "\uC4E9\uC4F0\uC4F1\uC4F4\uC4F8\uC4FA\uC4FF\uC500" +
                        "\uC501\uC50C\uC510\uC514\uC51C\uC528\uC529\uC52C" +
                        "\uC530\uC538\uC539\uC53B\uC53D\uC544\uC545\uC548" +
                        "\uC549\uC54A\uC54C\uC54D\uC54E\uC553\uC554\uC555" +
                        "\uC557\uC558\uC559\uC55D\uC55E\uC560\uC561\uC564" +
                        "\uC568\uC570\uC571\uC573\uC574\uC575\uC57C\uC57D" +
                        "\uC580\uC584\uC587\uC58C\uC58D\uC58F\uC591\uC595" +
                        "\uC597\uC598\uC59C\uC5A0\uC5A9\uC5B4\uC5B5\uC5B8" +
                        "\uC5B9\uC5BB\uC5BC\uC5BD\uC5BE\uC5C4\uC5C5\uC5C6" +
                        "\uC5C7\uC5C8\uC5C9\uC5CA\uC5CC\uC5CE",
                "\uC5D0\uC5D1\uC5D4\uC5D8\uC5E0\uC5E1\uC5E3\uC5E5" +
                        "\uC5EC\uC5ED\uC5EE\uC5F0\uC5F4\uC5F6\uC5F7\uC5FC" +
                        "\uC5FD\uC5FE\uC5FF\uC600\uC601\uC605\uC606\uC607" +
                        "\uC608\uC60C\uC610\uC618\uC619\uC61B\uC61C\uC624" +
                        "\uC625\uC628\uC62C\uC62D\uC62E\uC630\uC633\uC634" +
                        "\uC635\uC637\uC639\uC63B\uC640\uC641\uC644\uC648" +
                        "\uC650\uC651\uC653\uC654\uC655\uC65C\uC65D\uC660" +
                        "\uC66C\uC66F\uC671\uC678\uC679\uC67C\uC680\uC688" +
                        "\uC689\uC68B\uC68D\uC694\uC695\uC698\uC69C\uC6A4" +
                        "\uC6A5\uC6A7\uC6A9\uC6B0\uC6B1\uC6B4\uC6B8\uC6B9" +
                        "\uC6BA\uC6C0\uC6C1\uC6C3\uC6C5\uC6CC\uC6CD\uC6D0" +
                        "\uC6D4\uC6DC\uC6DD\uC6E0\uC6E1\uC6E8",
                "\uC6E9\uC6EC\uC6F0\uC6F8\uC6F9\uC6FD\uC704\uC705" +
                        "\uC708\uC70C\uC714\uC715\uC717\uC719\uC720\uC721" +
                        "\uC724\uC728\uC730\uC731\uC733\uC735\uC737\uC73C" +
                        "\uC73D\uC740\uC744\uC74A\uC74C\uC74D\uC74F\uC751" +
                        "\uC752\uC753\uC754\uC755\uC756\uC757\uC758\uC75C" +
                        "\uC760\uC768\uC76B\uC774\uC775\uC778\uC77C\uC77D" +
                        "\uC77E\uC783\uC784\uC785\uC787\uC788\uC789\uC78A" +
                        "\uC78E\uC790\uC791\uC794\uC796\uC797\uC798\uC79A" +
                        "\uC7A0\uC7A1\uC7A3\uC7A4\uC7A5\uC7A6\uC7AC\uC7AD" +
                        "\uC7B0\uC7B4\uC7BC\uC7BD\uC7BF\uC7C0\uC7C1\uC7C8" +
                        "\uC7C9\uC7CC\uC7CE\uC7D0\uC7D8\uC7DD\uC7E4\uC7E8" +
                        "\uC7EC\uC800\uC801\uC804\uC808\uC80A",
                "\uC810\uC811\uC813\uC815\uC816\uC81C\uC81D\uC820" +
                        "\uC824\uC82C\uC82D\uC82F\uC831\uC838\uC83C\uC840" +
                        "\uC848\uC849\uC84C\uC84D\uC854\uC870\uC871\uC874" +
                        "\uC878\uC87A\uC880\uC881\uC883\uC885\uC886\uC887" +
                        "\uC88B\uC88C\uC88D\uC894\uC89D\uC89F\uC8A1\uC8A8" +
                        "\uC8BC\uC8BD\uC8C4\uC8C8\uC8CC\uC8D4\uC8D5\uC8D7" +
                        "\uC8D9\uC8E0\uC8E1\uC8E4\uC8F5\uC8FC\uC8FD\uC900" +
                        "\uC904\uC905\uC906\uC90C\uC90D\uC90F\uC911\uC918" +
                        "\uC92C\uC934\uC950\uC951\uC954\uC958\uC960\uC961" +
                        "\uC963\uC96C\uC970\uC974\uC97C\uC988\uC989\uC98C" +
                        "\uC990\uC998\uC999\uC99B\uC99D\uC9C0\uC9C1\uC9C4" +
                        "\uC9C7\uC9C8\uC9CA\uC9D0\uC9D1\uC9D3",
                "\uC9D5\uC9D6\uC9D9\uC9DA\uC9DC\uC9DD\uC9E0\uC9E2" +
                        "\uC9E4\uC9E7\uC9EC\uC9ED\uC9EF\uC9F0\uC9F1\uC9F8" +
                        "\uC9F9\uC9FC\uCA00\uCA08\uCA09\uCA0B\uCA0C\uCA0D" +
                        "\uCA14\uCA18\uCA29\uCA4C\uCA4D\uCA50\uCA54\uCA5C" +
                        "\uCA5D\uCA5F\uCA60\uCA61\uCA68\uCA7D\uCA84\uCA98" +
                        "\uCABC\uCABD\uCAC0\uCAC4\uCACC\uCACD\uCACF\uCAD1" +
                        "\uCAD3\uCAD8\uCAD9\uCAE0\uCAEC\uCAF4\uCB08\uCB10" +
                        "\uCB14\uCB18\uCB20\uCB21\uCB41\uCB48\uCB49\uCB4C" +
                        "\uCB50\uCB58\uCB59\uCB5D\uCB64\uCB78\uCB79\uCB9C" +
                        "\uCBB8\uCBD4\uCBE4\uCBE7\uCBE9\uCC0C\uCC0D\uCC10" +
                        "\uCC14\uCC1C\uCC1D\uCC21\uCC22\uCC27\uCC28\uCC29" +
                        "\uCC2C\uCC2E\uCC30\uCC38\uCC39\uCC3B",
                "\uCC3C\uCC3D\uCC3E\uCC44\uCC45\uCC48\uCC4C\uCC54" +
                        "\uCC55\uCC57\uCC58\uCC59\uCC60\uCC64\uCC66\uCC68" +
                        "\uCC70\uCC75\uCC98\uCC99\uCC9C\uCCA0\uCCA8\uCCA9" +
                        "\uCCAB\uCCAC\uCCAD\uCCB4\uCCB5\uCCB8\uCCBC\uCCC4" +
                        "\uCCC5\uCCC7\uCCC9\uCCD0\uCCD4\uCCE4\uCCEC\uCCF0" +
                        "\uCD01\uCD08\uCD09\uCD0C\uCD10\uCD18\uCD19\uCD1B" +
                        "\uCD1D\uCD24\uCD28\uCD2C\uCD39\uCD5C\uCD60\uCD64" +
                        "\uCD6C\uCD6D\uCD6F\uCD71\uCD78\uCD88\uCD94\uCD95" +
                        "\uCD98\uCD9C\uCDA4\uCDA5\uCDA7\uCDA9\uCDB0\uCDC4" +
                        "\uCDCC\uCDD0\uCDE8\uCDEC\uCDF0\uCDF8\uCDF9\uCDFB" +
                        "\uCDFD\uCE04\uCE08\uCE0C\uCE14\uCE19\uCE20\uCE21" +
                        "\uCE24\uCE28\uCE30\uCE31\uCE33\uCE35",
                "\uCE58\uCE59\uCE5C\uCE5F\uCE60\uCE61\uCE68\uCE69" +
                        "\uCE6B\uCE6D\uCE74\uCE75\uCE78\uCE7C\uCE84\uCE85" +
                        "\uCE87\uCE89\uCE90\uCE91\uCE94\uCE98\uCEA0\uCEA1" +
                        "\uCEA3\uCEA4\uCEA5\uCEAC\uCEAD\uCEC1\uCEE4\uCEE5" +
                        "\uCEE8\uCEEB\uCEEC\uCEF4\uCEF5\uCEF7\uCEF8\uCEF9" +
                        "\uCF00\uCF01\uCF04\uCF08\uCF10\uCF11\uCF13\uCF15" +
                        "\uCF1C\uCF20\uCF24\uCF2C\uCF2D\uCF2F\uCF30\uCF31" +
                        "\uCF38\uCF54\uCF55\uCF58\uCF5C\uCF64\uCF65\uCF67" +
                        "\uCF69\uCF70\uCF71\uCF74\uCF78\uCF80\uCF85\uCF8C" +
                        "\uCFA1\uCFA8\uCFB0\uCFC4\uCFE0\uCFE1\uCFE4\uCFE8" +
                        "\uCFF0\uCFF1\uCFF3\uCFF5\uCFFC\uD000\uD004\uD011" +
                        "\uD018\uD02D\uD034\uD035\uD038\uD03C",
                "\uD044\uD045\uD047\uD049\uD050\uD054\uD058\uD060" +
                        "\uD06C\uD06D\uD070\uD074\uD07C\uD07D\uD081\uD0A4" +
                        "\uD0A5\uD0A8\uD0AC\uD0B4\uD0B5\uD0B7\uD0B9\uD0C0" +
                        "\uD0C1\uD0C4\uD0C8\uD0C9\uD0D0\uD0D1\uD0D3\uD0D4" +
                        "\uD0D5\uD0DC\uD0DD\uD0E0\uD0E4\uD0EC\uD0ED\uD0EF" +
                        "\uD0F0\uD0F1\uD0F8\uD10D\uD130\uD131\uD134\uD138" +
                        "\uD13A\uD140\uD141\uD143\uD144\uD145\uD14C\uD14D" +
                        "\uD150\uD154\uD15C\uD15D\uD15F\uD161\uD168\uD16C" +
                        "\uD17C\uD184\uD188\uD1A0\uD1A1\uD1A4\uD1A8\uD1B0" +
                        "\uD1B1\uD1B3\uD1B5\uD1BA\uD1BC\uD1C0\uD1D8\uD1F4" +
                        "\uD1F8\uD207\uD209\uD210\uD22C\uD22D\uD230\uD234" +
                        "\uD23C\uD23D\uD23F\uD241\uD248\uD25C",
                "\uD264\uD280\uD281\uD284\uD288\uD290\uD291\uD295" +
                        "\uD29C\uD2A0\uD2A4\uD2AC\uD2B1\uD2B8\uD2B9\uD2BC" +
                        "\uD2BF\uD2C0\uD2C2\uD2C8\uD2C9\uD2CB\uD2D4\uD2D8" +
                        "\uD2DC\uD2E4\uD2E5\uD2F0\uD2F1\uD2F4\uD2F8\uD300" +
                        "\uD301\uD303\uD305\uD30C\uD30D\uD30E\uD310\uD314" +
                        "\uD316\uD31C\uD31D\uD31F\uD320\uD321\uD325\uD328" +
                        "\uD329\uD32C\uD330\uD338\uD339\uD33B\uD33C\uD33D" +
                        "\uD344\uD345\uD37C\uD37D\uD380\uD384\uD38C\uD38D" +
                        "\uD38F\uD390\uD391\uD398\uD399\uD39C\uD3A0\uD3A8" +
                        "\uD3A9\uD3AB\uD3AD\uD3B4\uD3B8\uD3BC\uD3C4\uD3C5" +
                        "\uD3C8\uD3C9\uD3D0\uD3D8\uD3E1\uD3E3\uD3EC\uD3ED" +
                        "\uD3F0\uD3F4\uD3FC\uD3FD\uD3FF\uD401",
                "\uD408\uD41D\uD440\uD444\uD45C\uD460\uD464\uD46D" +
                        "\uD46F\uD478\uD479\uD47C\uD47F\uD480\uD482\uD488" +
                        "\uD489\uD48B\uD48D\uD494\uD4A9\uD4CC\uD4D0\uD4D4" +
                        "\uD4DC\uD4DF\uD4E8\uD4EC\uD4F0\uD4F8\uD4FB\uD4FD" +
                        "\uD504\uD508\uD50C\uD514\uD515\uD517\uD53C\uD53D" +
                        "\uD540\uD544\uD54C\uD54D\uD54F\uD551\uD558\uD559" +
                        "\uD55C\uD560\uD565\uD568\uD569\uD56B\uD56D\uD574" +
                        "\uD575\uD578\uD57C\uD584\uD585\uD587\uD588\uD589" +
                        "\uD590\uD5A5\uD5C8\uD5C9\uD5CC\uD5D0\uD5D2\uD5D8" +
                        "\uD5D9\uD5DB\uD5DD\uD5E4\uD5E5\uD5E8\uD5EC\uD5F4" +
                        "\uD5F5\uD5F7\uD5F9\uD600\uD601\uD604\uD608\uD610" +
                        "\uD611\uD613\uD614\uD615\uD61C\uD620",
                "\uD624\uD62D\uD638\uD639\uD63C\uD640\uD645\uD648" +
                        "\uD649\uD64B\uD64D\uD651\uD654\uD655\uD658\uD65C" +
                        "\uD667\uD669\uD670\uD671\uD674\uD683\uD685\uD68C" +
                        "\uD68D\uD690\uD694\uD69D\uD69F\uD6A1\uD6A8\uD6AC" +
                        "\uD6B0\uD6B9\uD6BB\uD6C4\uD6C5\uD6C8\uD6CC\uD6D1" +
                        "\uD6D4\uD6D7\uD6D9\uD6E0\uD6E4\uD6E8\uD6F0\uD6F5" +
                        "\uD6FC\uD6FD\uD700\uD704\uD711\uD718\uD719\uD71C" +
                        "\uD720\uD728\uD729\uD72B\uD72D\uD734\uD735\uD738" +
                        "\uD73C\uD744\uD747\uD749\uD750\uD751\uD754\uD756" +
                        "\uD757\uD758\uD759\uD760\uD761\uD763\uD765\uD769" +
                        "\uD76C\uD770\uD774\uD77C\uD77D\uD781\uD788\uD789" +
                        "\uD78C\uD790\uD798\uD799\uD79B\uD79D",
                null,
                "\u4F3D\u4F73\u5047\u50F9\u52A0\u53EF\u5475\u54E5" +
                        "\u5609\u5AC1\u5BB6\u6687\u67B6\u67B7\u67EF\u6B4C" +
                        "\u73C2\u75C2\u7A3C\u82DB\u8304\u8857\u8888\u8A36" +
                        "\u8CC8\u8DCF\u8EFB\u8FE6\u99D5\u523B\u5374\u5404" +
                        "\u606A\u6164\u6BBC\u73CF\u811A\u89BA\u89D2\u95A3" +
                        "\u4F83\u520A\u58BE\u5978\u59E6\u5E72\u5E79\u61C7" +
                        "\u63C0\u6746\u67EC\u687F\u6F97\u764E\u770B\u78F5" +
                        "\u7A08\u7AFF\u7C21\u809D\u826E\u8271\u8AEB\u9593" +
                        "\u4E6B\u559D\u66F7\u6E34\u78A3\u7AED\u845B\u8910" +
                        "\u874E\u97A8\u52D8\u574E\u582A\u5D4C\u611F\u61BE" +
                        "\u6221\u6562\u67D1\u6A44\u6E1B\u7518\u75B3\u76E3" +
                        "\u77B0\u7D3A\u90AF\u9451\u9452\u9F95",
                "\u5323\u5CAC\u7532\u80DB\u9240\u9598\u525B\u5808" +
                        "\u59DC\u5CA1\u5D17\u5EB7\u5F3A\u5F4A\u6177\u6C5F" +
                        "\u757A\u7586\u7CE0\u7D73\u7DB1\u7F8C\u8154\u8221" +
                        "\u8591\u8941\u8B1B\u92FC\u964D\u9C47\u4ECB\u4EF7" +
                        "\u500B\u51F1\u584F\u6137\u613E\u6168\u6539\u69EA" +
                        "\u6F11\u75A5\u7686\u76D6\u7B87\u82A5\u84CB\uF900" +
                        "\u93A7\u958B\u5580\u5BA2\u5751\uF901\u7CB3\u7FB9" +
                        "\u91B5\u5028\u53BB\u5C45\u5DE8\u62D2\u636E\u64DA" +
                        "\u64E7\u6E20\u70AC\u795B\u8DDD\u8E1E\uF902\u907D" +
                        "\u9245\u92F8\u4E7E\u4EF6\u5065\u5DFE\u5EFA\u6106" +
                        "\u6957\u8171\u8654\u8E47\u9375\u9A2B\u4E5E\u5091" +
                        "\u6770\u6840\u5109\u528D\u5292\u6AA2",
                "\u77BC\u9210\u9ED4\u52AB\u602F\u8FF2\u5048\u61A9" +
                        "\u63ED\u64CA\u683C\u6A84\u6FC0\u8188\u89A1\u9694" +
                        "\u5805\u727D\u72AC\u7504\u7D79\u7E6D\u80A9\u898B" +
                        "\u8B74\u9063\u9D51\u6289\u6C7A\u6F54\u7D50\u7F3A" +
                        "\u8A23\u517C\u614A\u7B9D\u8B19\u9257\u938C\u4EAC" +
                        "\u4FD3\u501E\u50BE\u5106\u52C1\u52CD\u537F\u5770" +
                        "\u5883\u5E9A\u5F91\u6176\u61AC\u64CE\u656C\u666F" +
                        "\u66BB\u66F4\u6897\u6D87\u7085\u70F1\u749F\u74A5" +
                        "\u74CA\u75D9\u786C\u78EC\u7ADF\u7AF6\u7D45\u7D93" +
                        "\u8015\u803F\u811B\u8396\u8B66\u8F15\u9015\u93E1" +
                        "\u9803\u9838\u9A5A\u9BE8\u4FC2\u5553\u583A\u5951" +
                        "\u5B63\u5C46\u60B8\u6212\u6842\u68B0",
                "\u68E8\u6EAA\u754C\u7678\u78CE\u7A3D\u7CFB\u7E6B" +
                        "\u7E7C\u8A08\u8AA1\u8C3F\u968E\u9DC4\u53E4\u53E9" +
                        "\u544A\u5471\u56FA\u59D1\u5B64\u5C3B\u5EAB\u62F7" +
                        "\u6537\u6545\u6572\u66A0\u67AF\u69C1\u6CBD\u75FC" +
                        "\u7690\u777E\u7A3F\u7F94\u8003\u80A1\u818F\u82E6" +
                        "\u82FD\u83F0\u85C1\u8831\u88B4\u8AA5\uF903\u8F9C" +
                        "\u932E\u96C7\u9867\u9AD8\u9F13\u54ED\u659B\u66F2" +
                        "\u688F\u7A40\u8C37\u9D60\u56F0\u5764\u5D11\u6606" +
                        "\u68B1\u68CD\u6EFE\u7428\u889E\u9BE4\u6C68\uF904" +
                        "\u9AA8\u4F9B\u516C\u5171\u529F\u5B54\u5DE5\u6050" +
                        "\u606D\u62F1\u63A7\u653B\u73D9\u7A7A\u86A3\u8CA2" +
                        "\u978F\u4E32\u5BE1\u6208\u679C\u74DC",
                "\u79D1\u83D3\u8A87\u8AB2\u8DE8\u904E\u934B\u9846" +
                        "\u5ED3\u69E8\u85FF\u90ED\uF905\u51A0\u5B98\u5BEC" +
                        "\u6163\u68FA\u6B3E\u704C\u742F\u74D8\u7BA1\u7F50" +
                        "\u83C5\u89C0\u8CAB\u95DC\u9928\u522E\u605D\u62EC" +
                        "\u9002\u4F8A\u5149\u5321\u58D9\u5EE3\u66E0\u6D38" +
                        "\u709A\u72C2\u73D6\u7B50\u80F1\u945B\u5366\u639B" +
                        "\u7F6B\u4E56\u5080\u584A\u58DE\u602A\u6127\u62D0" +
                        "\u69D0\u9B41\u5B8F\u7D18\u80B1\u8F5F\u4EA4\u50D1" +
                        "\u54AC\u55AC\u5B0C\u5DA0\u5DE7\u652A\u654E\u6821" +
                        "\u6A4B\u72E1\u768E\u77EF\u7D5E\u7FF9\u81A0\u854E" +
                        "\u86DF\u8F03\u8F4E\u90CA\u9903\u9A55\u9BAB\u4E18" +
                        "\u4E45\u4E5D\u4EC7\u4FF1\u5177\u52FE",
                "\u5340\u53E3\u53E5\u548E\u5614\u5775\u57A2\u5BC7" +
                        "\u5D87\u5ED0\u61FC\u62D8\u6551\u67B8\u67E9\u69CB" +
                        "\u6B50\u6BC6\u6BEC\u6C42\u6E9D\u7078\u72D7\u7396" +
                        "\u7403\u77BF\u77E9\u7A76\u7D7F\u8009\u81FC\u8205" +
                        "\u820A\u82DF\u8862\u8B33\u8CFC\u8EC0\u9011\u90B1" +
                        "\u9264\u92B6\u99D2\u9A45\u9CE9\u9DD7\u9F9C\u570B" +
                        "\u5C40\u83CA\u97A0\u97AB\u9EB4\u541B\u7A98\u7FA4" +
                        "\u88D9\u8ECD\u90E1\u5800\u5C48\u6398\u7A9F\u5BAE" +
                        "\u5F13\u7A79\u7AAE\u828E\u8EAC\u5026\u5238\u52F8" +
                        "\u5377\u5708\u62F3\u6372\u6B0A\u6DC3\u7737\u53A5" +
                        "\u7357\u8568\u8E76\u95D5\u673A\u6AC3\u6F70\u8A6D" +
                        "\u8ECC\u994B\uF906\u6677\u6B78\u8CB4",
                "\u9B3C\uF907\u53EB\u572D\u594E\u63C6\u69FB\u73EA" +
                        "\u7845\u7ABA\u7AC5\u7CFE\u8475\u898F\u8D73\u9035" +
                        "\u95A8\u52FB\u5747\u7547\u7B60\u83CC\u921E\uF908" +
                        "\u6A58\u514B\u524B\u5287\u621F\u68D8\u6975\u9699" +
                        "\u50C5\u52A4\u52E4\u61C3\u65A4\u6839\u69FF\u747E" +
                        "\u7B4B\u82B9\u83EB\u89B2\u8B39\u8FD1\u9949\uF909" +
                        "\u4ECA\u5997\u64D2\u6611\u6A8E\u7434\u7981\u79BD" +
                        "\u82A9\u887E\u887F\u895F\uF90A\u9326\u4F0B\u53CA" +
                        "\u6025\u6271\u6C72\u7D1A\u7D66\u4E98\u5162\u77DC" +
                        "\u80AF\u4F01\u4F0E\u5176\u5180\u55DC\u5668\u573B" +
                        "\u57FA\u57FC\u5914\u5947\u5993\u5BC4\u5C90\u5D0E" +
                        "\u5DF1\u5E7E\u5FCC\u6280\u65D7\u65E3",
                "\u671E\u671F\u675E\u68CB\u68C4\u6A5F\u6B3A\u6C23" +
                        "\u6C7D\u6C82\u6DC7\u7398\u7426\u742A\u7482\u74A3" +
                        "\u7578\u757F\u7881\u78EF\u7941\u7947\u7948\u797A" +
                        "\u7B95\u7D00\u7DBA\u7F88\u8006\u802D\u808C\u8A18" +
                        "\u8B4F\u8C48\u8D77\u9321\u9324\u98E2\u9951\u9A0E" +
                        "\u9A0F\u9A65\u9E92\u7DCA\u4F76\u5409\u62EE\u6854" +
                        "\u91D1\u55AB\u513A\uF90B\uF90C\u5A1C\u61E6\uF90D" +
                        "\u62CF\u62FF\uF90E\uF90F\uF910\uF911\uF912\uF913" +
                        "\u90A3\uF914\uF915\uF916\uF917\uF918\u8AFE\uF919" +
                        "\uF91A\uF91B\uF91C\u6696\uF91D\u7156\uF91E\uF91F" +
                        "\u96E3\uF920\u634F\u637A\u5357\uF921\u678F\u6960" +
                        "\u6E73\uF922\u7537\uF923\uF924\uF925",
                "\u7D0D\uF926\uF927\u8872\u56CA\u5A18\uF928\uF929" +
                        "\uF92A\uF92B\uF92C\u4E43\uF92D\u5167\u5948\u67F0" +
                        "\u8010\uF92E\u5973\u5E74\u649A\u79CA\u5FF5\u606C" +
                        "\u62C8\u637B\u5BE7\u5BD7\u52AA\uF92F\u5974\u5F29" +
                        "\u6012\uF930\uF931\uF932\u7459\uF933\uF934\uF935" +
                        "\uF936\uF937\uF938\u99D1\uF939\uF93A\uF93B\uF93C" +
                        "\uF93D\uF93E\uF93F\uF940\uF941\uF942\uF943\u6FC3" +
                        "\uF944\uF945\u81BF\u8FB2\u60F1\uF946\uF947\u8166" +
                        "\uF948\uF949\u5C3F\uF94A\uF94B\uF94C\uF94D\uF94E" +
                        "\uF94F\uF950\uF951\u5AE9\u8A25\u677B\u7D10\uF952" +
                        "\uF953\uF954\uF955\uF956\uF957\u80FD\uF958\uF959" +
                        "\u5C3C\u6CE5\u533F\u6EBA\u591A\u8336",
                "\u4E39\u4EB6\u4F46\u55AE\u5718\u58C7\u5F56\u65B7" +
                        "\u65E6\u6A80\u6BB5\u6E4D\u77ED\u7AEF\u7C1E\u7DDE" +
                        "\u86CB\u8892\u9132\u935B\u64BB\u6FBE\u737A\u75B8" +
                        "\u9054\u5556\u574D\u61BA\u64D4\u66C7\u6DE1\u6E5B" +
                        "\u6F6D\u6FB9\u75F0\u8043\u81BD\u8541\u8983\u8AC7" +
                        "\u8B5A\u931F\u6C93\u7553\u7B54\u8E0F\u905D\u5510" +
                        "\u5802\u5858\u5E62\u6207\u649E\u68E0\u7576\u7CD6" +
                        "\u87B3\u9EE8\u4EE3\u5788\u576E\u5927\u5C0D\u5CB1" +
                        "\u5E36\u5F85\u6234\u64E1\u73B3\u81FA\u888B\u8CB8" +
                        "\u968A\u9EDB\u5B85\u5FB7\u60B3\u5012\u5200\u5230" +
                        "\u5716\u5835\u5857\u5C0E\u5C60\u5CF6\u5D8B\u5EA6" +
                        "\u5F92\u60BC\u6311\u6389\u6417\u6843",
                "\u68F9\u6AC2\u6DD8\u6E21\u6ED4\u6FE4\u71FE\u76DC" +
                        "\u7779\u79B1\u7A3B\u8404\u89A9\u8CED\u8DF3\u8E48" +
                        "\u9003\u9014\u9053\u90FD\u934D\u9676\u97DC\u6BD2" +
                        "\u7006\u7258\u72A2\u7368\u7763\u79BF\u7BE4\u7E9B" +
                        "\u8B80\u58A9\u60C7\u6566\u65FD\u66BE\u6C8C\u711E" +
                        "\u71C9\u8C5A\u9813\u4E6D\u7A81\u4EDD\u51AC\u51CD" +
                        "\u52D5\u540C\u61A7\u6771\u6850\u68DF\u6D1E\u6F7C" +
                        "\u75BC\u77B3\u7AE5\u80F4\u8463\u9285\u515C\u6597" +
                        "\u675C\u6793\u75D8\u7AC7\u8373\uF95A\u8C46\u9017" +
                        "\u982D\u5C6F\u81C0\u829A\u9041\u906F\u920D\u5F97" +
                        "\u5D9D\u6A59\u71C8\u767B\u7B49\u85E4\u8B04\u9127" +
                        "\u9A30\u5587\u61F6\uF95B\u7669\u7F85",
                "\u863F\u87BA\u88F8\u908F\uF95C\u6D1B\u70D9\u73DE" +
                        "\u7D61\u843D\uF95D\u916A\u99F1\uF95E\u4E82\u5375" +
                        "\u6B04\u6B12\u703E\u721B\u862D\u9E1E\u524C\u8FA3" +
                        "\u5D50\u64E5\u652C\u6B16\u6FEB\u7C43\u7E9C\u85CD" +
                        "\u8964\u89BD\u62C9\u81D8\u881F\u5ECA\u6717\u6D6A" +
                        "\u72FC\u7405\u746F\u8782\u90DE\u4F86\u5D0D\u5FA0" +
                        "\u840A\u51B7\u63A0\u7565\u4EAE\u5006\u5169\u51C9" +
                        "\u6881\u6A11\u7CAE\u7CB1\u7CE7\u826F\u8AD2\u8F1B" +
                        "\u91CF\u4FB6\u5137\u52F5\u5442\u5EEC\u616E\u623E" +
                        "\u65C5\u6ADA\u6FFE\u792A\u85DC\u8823\u95AD\u9A62" +
                        "\u9A6A\u9E97\u9ECE\u529B\u66C6\u6B77\u701D\u792B" +
                        "\u8F62\u9742\u6190\u6200\u6523\u6F23",
                "\u7149\u7489\u7DF4\u806F\u84EE\u8F26\u9023\u934A" +
                        "\u51BD\u5217\u52A3\u6D0C\u70C8\u88C2\u5EC9\u6582" +
                        "\u6BAE\u6FC2\u7C3E\u7375\u4EE4\u4F36\u56F9\uF95F" +
                        "\u5CBA\u5DBA\u601C\u73B2\u7B2D\u7F9A\u7FCE\u8046" +
                        "\u901E\u9234\u96F6\u9748\u9818\u9F61\u4F8B\u6FA7" +
                        "\u79AE\u91B4\u96B7\u52DE\uF960\u6488\u64C4\u6AD3" +
                        "\u6F5E\u7018\u7210\u76E7\u8001\u8606\u865C\u8DEF" +
                        "\u8F05\u9732\u9B6F\u9DFA\u9E75\u788C\u797F\u7DA0" +
                        "\u83C9\u9304\u9E7F\u9E93\u8AD6\u58DF\u5F04\u6727" +
                        "\u7027\u74CF\u7C60\u807E\u5121\u7028\u7262\u78CA" +
                        "\u8CC2\u8CDA\u8CF4\u96F7\u4E86\u50DA\u5BEE\u5ED6" +
                        "\u6599\u71CE\u7642\u77AD\u804A\u84FC",
                "\u907C\u9B27\u9F8D\u58D8\u5A41\u5C62\u6A13\u6DDA" +
                        "\u6F0F\u763B\u7D2F\u7E37\u851E\u8938\u93E4\u964B" +
                        "\u5289\u65D2\u67F3\u69B4\u6D41\u6E9C\u700F\u7409" +
                        "\u7460\u7559\u7624\u786B\u8B2C\u985E\u516D\u622E" +
                        "\u9678\u4F96\u502B\u5D19\u6DEA\u7DB8\u8F2A\u5F8B" +
                        "\u6144\u6817\uF961\u9686\u52D2\u808B\u51DC\u51CC" +
                        "\u695E\u7A1C\u7DBE\u83F1\u9675\u4FDA\u5229\u5398" +
                        "\u540F\u550E\u5C65\u60A7\u674E\u68A8\u6D6C\u7281" +
                        "\u72F8\u7406\u7483\uF962\u75E2\u7C6C\u7F79\u7FB8" +
                        "\u8389\u88CF\u88E1\u91CC\u91D0\u96E2\u9BC9\u541D" +
                        "\u6F7E\u71D0\u7498\u85FA\u8EAA\u96A3\u9C57\u9E9F" +
                        "\u6797\u6DCB\u7433\u81E8\u9716\u782C",
                "\u7ACB\u7B20\u7C92\u6469\u746A\u75F2\u78BC\u78E8" +
                        "\u99AC\u9B54\u9EBB\u5BDE\u5E55\u6F20\u819C\u83AB" +
                        "\u9088\u4E07\u534D\u5A29\u5DD2\u5F4E\u6162\u633D" +
                        "\u6669\u66FC\u6EFF\u6F2B\u7063\u779E\u842C\u8513" +
                        "\u883B\u8F13\u9945\u9C3B\u551C\u62B9\u672B\u6CAB" +
                        "\u8309\u896A\u977A\u4EA1\u5984\u5FD8\u5FD9\u671B" +
                        "\u7DB2\u7F54\u8292\u832B\u83BD\u8F1E\u9099\u57CB" +
                        "\u59B9\u5A92\u5BD0\u6627\u679A\u6885\u6BCF\u7164" +
                        "\u7F75\u8CB7\u8CE3\u9081\u9B45\u8108\u8C8A\u964C" +
                        "\u9A40\u9EA5\u5B5F\u6C13\u731B\u76F2\u76DF\u840C" +
                        "\u51AA\u8993\u514D\u5195\u52C9\u68C9\u6C94\u7704" +
                        "\u7720\u7DBF\u7DEC\u9762\u9EB5\u6EC5",
                "\u8511\u51A5\u540D\u547D\u660E\u669D\u6927\u6E9F" +
                        "\u76BF\u7791\u8317\u84C2\u879F\u9169\u9298\u9CF4" +
                        "\u8882\u4FAE\u5192\u52DF\u59C6\u5E3D\u6155\u6478" +
                        "\u6479\u66AE\u67D0\u6A21\u6BCD\u6BDB\u725F\u7261" +
                        "\u7441\u7738\u77DB\u8017\u82BC\u8305\u8B00\u8B28" +
                        "\u8C8C\u6728\u6C90\u7267\u76EE\u7766\u7A46\u9DA9" +
                        "\u6B7F\u6C92\u5922\u6726\u8499\u536F\u5893\u5999" +
                        "\u5EDF\u63CF\u6634\u6773\u6E3A\u732B\u7AD7\u82D7" +
                        "\u9328\u52D9\u5DEB\u61AE\u61CB\u620A\u62C7\u64AB" +
                        "\u65E0\u6959\u6B66\u6BCB\u7121\u73F7\u755D\u7E46" +
                        "\u821E\u8302\u856A\u8AA3\u8CBF\u9727\u9D61\u58A8" +
                        "\u9ED8\u5011\u520E\u543B\u554F\u6587",
                "\u6C76\u7D0A\u7D0B\u805E\u868A\u9580\u96EF\u52FF" +
                        "\u6C95\u7269\u5473\u5A9A\u5C3E\u5D4B\u5F4C\u5FAE" +
                        "\u672A\u68B6\u6963\u6E3C\u6E44\u7709\u7C73\u7F8E" +
                        "\u8587\u8B0E\u8FF7\u9761\u9EF4\u5CB7\u60B6\u610D" +
                        "\u61AB\u654F\u65FB\u65FC\u6C11\u6CEF\u739F\u73C9" +
                        "\u7DE1\u9594\u5BC6\u871C\u8B10\u525D\u535A\u62CD" +
                        "\u640F\u64B2\u6734\u6A38\u6CCA\u73C0\u749E\u7B94" +
                        "\u7C95\u7E1B\u818A\u8236\u8584\u8FEB\u96F9\u99C1" +
                        "\u4F34\u534A\u53CD\u53DB\u62CC\u642C\u6500\u6591" +
                        "\u69C3\u6CEE\u6F58\u73ED\u7554\u7622\u76E4\u76FC" +
                        "\u78D0\u78FB\u792C\u7D46\u822C\u87E0\u8FD4\u9812" +
                        "\u98EF\u52C3\u62D4\u64A5\u6E24\u6F51",
                "\u767C\u8DCB\u91B1\u9262\u9AEE\u9B43\u5023\u508D" +
                        "\u574A\u59A8\u5C28\u5E47\u5F77\u623F\u653E\u65B9" +
                        "\u65C1\u6609\u678B\u699C\u6EC2\u78C5\u7D21\u80AA" +
                        "\u8180\u822B\u82B3\u84A1\u868C\u8A2A\u8B17\u90A6" +
                        "\u9632\u9F90\u500D\u4FF3\uF963\u57F9\u5F98\u62DC" +
                        "\u6392\u676F\u6E43\u7119\u76C3\u80CC\u80DA\u88F4" +
                        "\u88F5\u8919\u8CE0\u8F29\u914D\u966A\u4F2F\u4F70" +
                        "\u5E1B\u67CF\u6822\u767D\u767E\u9B44\u5E61\u6A0A" +
                        "\u7169\u71D4\u756A\uF964\u7E41\u8543\u85E9\u98DC" +
                        "\u4F10\u7B4F\u7F70\u95A5\u51E1\u5E06\u68B5\u6C3E" +
                        "\u6C4E\u6CDB\u72AF\u7BC4\u8303\u6CD5\u743A\u50FB" +
                        "\u5288\u58C1\u64D8\u6A97\u74A7\u7656",
                "\u78A7\u8617\u95E2\u9739\uF965\u535E\u5F01\u8B8A" +
                        "\u8FA8\u8FAF\u908A\u5225\u77A5\u9C49\u9F08\u4E19" +
                        "\u5002\u5175\u5C5B\u5E77\u661E\u663A\u67C4\u68C5" +
                        "\u70B3\u7501\u75C5\u79C9\u7ADD\u8F27\u9920\u9A08" +
                        "\u4FDD\u5821\u5831\u5BF6\u666E\u6B65\u6D11\u6E7A" +
                        "\u6F7D\u73E4\u752B\u83E9\u88DC\u8913\u8B5C\u8F14" +
                        "\u4F0F\u50D5\u5310\u535C\u5B93\u5FA9\u670D\u798F" +
                        "\u8179\u832F\u8514\u8907\u8986\u8F39\u8F3B\u99A5" +
                        "\u9C12\u672C\u4E76\u4FF8\u5949\u5C01\u5CEF\u5CF0" +
                        "\u6367\u68D2\u70FD\u71A2\u742B\u7E2B\u84EC\u8702" +
                        "\u9022\u92D2\u9CF3\u4E0D\u4ED8\u4FEF\u5085\u5256" +
                        "\u526F\u5426\u5490\u57E0\u592B\u5A66",
                "\u5B5A\u5B75\u5BCC\u5E9C\uF966\u6276\u6577\u65A7" +
                        "\u6D6E\u6EA5\u7236\u7B26\u7C3F\u7F36\u8150\u8151" +
                        "\u819A\u8240\u8299\u83A9\u8A03\u8CA0\u8CE6\u8CFB" +
                        "\u8D74\u8DBA\u90E8\u91DC\u961C\u9644\u99D9\u9CE7" +
                        "\u5317\u5206\u5429\u5674\u58B3\u5954\u596E\u5FFF" +
                        "\u61A4\u626E\u6610\u6C7E\u711A\u76C6\u7C89\u7CDE" +
                        "\u7D1B\u82AC\u8CC1\u96F0\uF967\u4F5B\u5F17\u5F7F" +
                        "\u62C2\u5D29\u670B\u68DA\u787C\u7E43\u9D6C\u4E15" +
                        "\u5099\u5315\u532A\u5351\u5983\u5A62\u5E87\u60B2" +
                        "\u618A\u6249\u6279\u6590\u6787\u69A7\u6BD4\u6BD6" +
                        "\u6BD7\u6BD8\u6CB8\uF968\u7435\u75FA\u7812\u7891" +
                        "\u79D5\u79D8\u7C83\u7DCB\u7FE1\u80A5",
                "\u813E\u81C2\u83F2\u871A\u88E8\u8AB9\u8B6C\u8CBB" +
                        "\u9119\u975E\u98DB\u9F3B\u56AC\u5B2A\u5F6C\u658C" +
                        "\u6AB3\u6BAF\u6D5C\u6FF1\u7015\u725D\u73AD\u8CA7" +
                        "\u8CD3\u983B\u6191\u6C37\u8058\u9A01\u4E4D\u4E8B" +
                        "\u4E9B\u4ED5\u4F3A\u4F3C\u4F7F\u4FDF\u50FF\u53F2" +
                        "\u53F8\u5506\u55E3\u56DB\u58EB\u5962\u5A11\u5BEB" +
                        "\u5BFA\u5C04\u5DF3\u5E2B\u5F99\u601D\u6368\u659C" +
                        "\u65AF\u67F6\u67FB\u68AD\u6B7B\u6C99\u6CD7\u6E23" +
                        "\u7009\u7345\u7802\u793E\u7940\u7960\u79C1\u7BE9" +
                        "\u7D17\u7D72\u8086\u820D\u838E\u84D1\u86C7\u88DF" +
                        "\u8A50\u8A5E\u8B1D\u8CDC\u8D66\u8FAD\u90AA\u98FC" +
                        "\u99DF\u9E9D\u524A\uF969\u6714\uF96A",
                "\u5098\u522A\u5C71\u6563\u6C55\u73CA\u7523\u759D" +
                        "\u7B97\u849C\u9178\u9730\u4E77\u6492\u6BBA\u715E" +
                        "\u85A9\u4E09\uF96B\u6749\u68EE\u6E17\u829F\u8518" +
                        "\u886B\u63F7\u6F81\u9212\u98AF\u4E0A\u50B7\u50CF" +
                        "\u511F\u5546\u55AA\u5617\u5B40\u5C19\u5CE0\u5E38" +
                        "\u5E8A\u5EA0\u5EC2\u60F3\u6851\u6A61\u6E58\u723D" +
                        "\u7240\u72C0\u76F8\u7965\u7BB1\u7FD4\u88F3\u89F4" +
                        "\u8A73\u8C61\u8CDE\u971C\u585E\u74BD\u8CFD\u55C7" +
                        "\uF96C\u7A61\u7D22\u8272\u7272\u751F\u7525\uF96D" +
                        "\u7B19\u5885\u58FB\u5DBC\u5E8F\u5EB6\u5F90\u6055" +
                        "\u6292\u637F\u654D\u6691\u66D9\u66F8\u6816\u68F2" +
                        "\u7280\u745E\u7B6E\u7D6E\u7DD6\u7F72",
                "\u80E5\u8212\u85AF\u897F\u8A93\u901D\u92E4\u9ECD" +
                        "\u9F20\u5915\u596D\u5E2D\u60DC\u6614\u6673\u6790" +
                        "\u6C50\u6DC5\u6F5F\u77F3\u78A9\u84C6\u91CB\u932B" +
                        "\u4ED9\u50CA\u5148\u5584\u5B0B\u5BA3\u6247\u657E" +
                        "\u65CB\u6E32\u717D\u7401\u7444\u7487\u74BF\u766C" +
                        "\u79AA\u7DDA\u7E55\u7FA8\u817A\u81B3\u8239\u861A" +
                        "\u87EC\u8A75\u8DE3\u9078\u9291\u9425\u994D\u9BAE" +
                        "\u5368\u5C51\u6954\u6CC4\u6D29\u6E2B\u820C\u859B" +
                        "\u893B\u8A2D\u8AAA\u96EA\u9F67\u5261\u66B9\u6BB2" +
                        "\u7E96\u87FE\u8D0D\u9583\u965D\u651D\u6D89\u71EE" +
                        "\uF96E\u57CE\u59D3\u5BAC\u6027\u60FA\u6210\u661F" +
                        "\u665F\u7329\u73F9\u76DB\u7701\u7B6C",
                "\u8056\u8072\u8165\u8AA0\u9192\u4E16\u52E2\u6B72" +
                        "\u6D17\u7A05\u7B39\u7D30\uF96F\u8CB0\u53EC\u562F" +
                        "\u5851\u5BB5\u5C0F\u5C11\u5DE2\u6240\u6383\u6414" +
                        "\u662D\u68B3\u6CBC\u6D88\u6EAF\u701F\u70A4\u71D2" +
                        "\u7526\u758F\u758E\u7619\u7B11\u7BE0\u7C2B\u7D20" +
                        "\u7D39\u852C\u856D\u8607\u8A34\u900D\u9061\u90B5" +
                        "\u92B7\u97F6\u9A37\u4FD7\u5C6C\u675F\u6D91\u7C9F" +
                        "\u7E8C\u8B16\u8D16\u901F\u5B6B\u5DFD\u640D\u84C0" +
                        "\u905C\u98E1\u7387\u5B8B\u609A\u677E\u6DDE\u8A1F" +
                        "\u8AA6\u9001\u980C\u5237\uF970\u7051\u788E\u9396" +
                        "\u8870\u91D7\u4FEE\u53D7\u55FD\u56DA\u5782\u58FD" +
                        "\u5AC2\u5B88\u5CAB\u5CC0\u5E25\u6101",
                "\u620D\u624B\u6388\u641C\u6536\u6578\u6A39\u6B8A" +
                        "\u6C34\u6D19\u6F31\u71E7\u72E9\u7378\u7407\u74B2" +
                        "\u7626\u7761\u79C0\u7A57\u7AEA\u7CB9\u7D8F\u7DAC" +
                        "\u7E61\u7F9E\u8129\u8331\u8490\u84DA\u85EA\u8896" +
                        "\u8AB0\u8B90\u8F38\u9042\u9083\u916C\u9296\u92B9" +
                        "\u968B\u96A7\u96A8\u96D6\u9700\u9808\u9996\u9AD3" +
                        "\u9B1A\u53D4\u587E\u5919\u5B70\u5BBF\u6DD1\u6F5A" +
                        "\u719F\u7421\u74B9\u8085\u83FD\u5DE1\u5F87\u5FAA" +
                        "\u6042\u65EC\u6812\u696F\u6A53\u6B89\u6D35\u6DF3" +
                        "\u73E3\u76FE\u77AC\u7B4D\u7D14\u8123\u821C\u8340" +
                        "\u84F4\u8563\u8A62\u8AC4\u9187\u931E\u9806\u99B4" +
                        "\u620C\u8853\u8FF0\u9265\u5D07\u5D27",
                "\u5D69\u745F\u819D\u8768\u6FD5\u62FE\u7FD2\u8936" +
                        "\u8972\u4E1E\u4E58\u50E7\u52DD\u5347\u627F\u6607" +
                        "\u7E69\u8805\u965E\u4F8D\u5319\u5636\u59CB\u5AA4" +
                        "\u5C38\u5C4E\u5C4D\u5E02\u5F11\u6043\u65BD\u662F" +
                        "\u6642\u67BE\u67F4\u731C\u77E2\u793A\u7FC5\u8494" +
                        "\u84CD\u8996\u8A66\u8A69\u8AE1\u8C55\u8C7A\u57F4" +
                        "\u5BD4\u5F0F\u606F\u62ED\u690D\u6B96\u6E5C\u7184" +
                        "\u7BD2\u8755\u8B58\u8EFE\u98DF\u98FE\u4F38\u4F81" +
                        "\u4FE1\u547B\u5A20\u5BB8\u613C\u65B0\u6668\u71FC" +
                        "\u7533\u795E\u7D33\u814E\u81E3\u8398\u85AA\u85CE" +
                        "\u8703\u8A0A\u8EAB\u8F9B\uF971\u8FC5\u5931\u5BA4" +
                        "\u5BE6\u6089\u5BE9\u5C0B\u5FC3\u6C81",
                "\uF972\u6DF1\u700B\u751A\u82AF\u8AF6\u4EC0\u5341" +
                        "\uF973\u96D9\u6C0F\u4E9E\u4FC4\u5152\u555E\u5A25" +
                        "\u5CE8\u6211\u7259\u82BD\u83AA\u86FE\u8859\u8A1D" +
                        "\u963F\u96C5\u9913\u9D09\u9D5D\u580A\u5CB3\u5DBD" +
                        "\u5E44\u60E1\u6115\u63E1\u6A02\u6E25\u9102\u9354" +
                        "\u984E\u9C10\u9F77\u5B89\u5CB8\u6309\u664F\u6848" +
                        "\u773C\u96C1\u978D\u9854\u9B9F\u65A1\u8B01\u8ECB" +
                        "\u95BC\u5535\u5CA9\u5DD6\u5EB5\u6697\u764C\u83F4" +
                        "\u95C7\u58D3\u62BC\u72CE\u9D28\u4EF0\u592E\u600F" +
                        "\u663B\u6B83\u79E7\u9D26\u5393\u54C0\u57C3\u5D16" +
                        "\u611B\u66D6\u6DAF\u788D\u827E\u9698\u9744\u5384" +
                        "\u627C\u6396\u6DB2\u7E0A\u814B\u984D",
                "\u6AFB\u7F4C\u9DAF\u9E1A\u4E5F\u503B\u51B6\u591C" +
                        "\u60F9\u63F6\u6930\u723A\u8036\uF974\u91CE\u5F31" +
                        "\uF975\uF976\u7D04\u82E5\u846F\u84BB\u85E5\u8E8D" +
                        "\uF977\u4F6F\uF978\uF979\u58E4\u5B43\u6059\u63DA" +
                        "\u6518\u656D\u6698\uF97A\u694A\u6A23\u6D0B\u7001" +
                        "\u716C\u75D2\u760D\u79B3\u7A70\uF97B\u7F8A\uF97C" +
                        "\u8944\uF97D\u8B93\u91C0\u967D\uF97E\u990A\u5704" +
                        "\u5FA1\u65BC\u6F01\u7600\u79A6\u8A9E\u99AD\u9B5A" +
                        "\u9F6C\u5104\u61B6\u6291\u6A8D\u81C6\u5043\u5830" +
                        "\u5F66\u7109\u8A00\u8AFA\u5B7C\u8616\u4FFA\u513C" +
                        "\u56B4\u5944\u63A9\u6DF9\u5DAA\u696D\u5186\u4E88" +
                        "\u4F59\uF97F\uF980\uF981\u5982\uF982",
                "\uF983\u6B5F\u6C5D\uF984\u74B5\u7916\uF985\u8207" +
                        "\u8245\u8339\u8F3F\u8F5D\uF986\u9918\uF987\uF988" +
                        "\uF989\u4EA6\uF98A\u57DF\u5F79\u6613\uF98B\uF98C" +
                        "\u75AB\u7E79\u8B6F\uF98D\u9006\u9A5B\u56A5\u5827" +
                        "\u59F8\u5A1F\u5BB4\uF98E\u5EF6\uF98F\uF990\u6350" +
                        "\u633B\uF991\u693D\u6C87\u6CBF\u6D8E\u6D93\u6DF5" +
                        "\u6F14\uF992\u70DF\u7136\u7159\uF993\u71C3\u71D5" +
                        "\uF994\u784F\u786F\uF995\u7B75\u7DE3\uF996\u7E2F" +
                        "\uF997\u884D\u8EDF\uF998\uF999\uF99A\u925B\uF99B" +
                        "\u9CF6\uF99C\uF99D\uF99E\u6085\u6D85\uF99F\u71B1" +
                        "\uF9A0\uF9A1\u95B1\u53AD\uF9A2\uF9A3\uF9A4\u67D3" +
                        "\uF9A5\u708E\u7130\u7430\u8276\u82D2",
                "\uF9A6\u95BB\u9AE5\u9E7D\u66C4\uF9A7\u71C1\u8449" +
                        "\uF9A8\uF9A9\u584B\uF9AA\uF9AB\u5DB8\u5F71\uF9AC" +
                        "\u6620\u668E\u6979\u69AE\u6C38\u6CF3\u6E36\u6F41" +
                        "\u6FDA\u701B\u702F\u7150\u71DF\u7370\uF9AD\u745B" +
                        "\uF9AE\u74D4\u76C8\u7A4E\u7E93\uF9AF\uF9B0\u82F1" +
                        "\u8A60\u8FCE\uF9B1\u9348\uF9B2\u9719\uF9B3\uF9B4" +
                        "\u4E42\u502A\uF9B5\u5208\u53E1\u66F3\u6C6D\u6FCA" +
                        "\u730A\u777F\u7A62\u82AE\u85DD\u8602\uF9B6\u88D4" +
                        "\u8A63\u8B7D\u8C6B\uF9B7\u92B3\uF9B8\u9713\u9810" +
                        "\u4E94\u4F0D\u4FC9\u50B2\u5348\u543E\u5433\u55DA" +
                        "\u5862\u58BA\u5967\u5A1B\u5BE4\u609F\uF9B9\u61CA" +
                        "\u6556\u65FF\u6664\u68A7\u6C5A\u6FB3",
                "\u70CF\u71AC\u7352\u7B7D\u8708\u8AA4\u9C32\u9F07" +
                        "\u5C4B\u6C83\u7344\u7389\u923A\u6EAB\u7465\u761F" +
                        "\u7A69\u7E15\u860A\u5140\u58C5\u64C1\u74EE\u7515" +
                        "\u7670\u7FC1\u9095\u96CD\u9954\u6E26\u74E6\u7AA9" +
                        "\u7AAA\u81E5\u86D9\u8778\u8A1B\u5A49\u5B8C\u5B9B" +
                        "\u68A1\u6900\u6D63\u73A9\u7413\u742C\u7897\u7DE9" +
                        "\u7FEB\u8118\u8155\u839E\u8C4C\u962E\u9811\u66F0" +
                        "\u5F80\u65FA\u6789\u6C6A\u738B\u502D\u5A03\u6B6A" +
                        "\u77EE\u5916\u5D6C\u5DCD\u7325\u754F\uF9BA\uF9BB" +
                        "\u50E5\u51F9\u582F\u592D\u5996\u59DA\u5BE5\uF9BC" +
                        "\uF9BD\u5DA2\u62D7\u6416\u6493\u64FE\uF9BE\u66DC" +
                        "\uF9BF\u6A48\uF9C0\u71FF\u7464\uF9C1",
                "\u7A88\u7AAF\u7E47\u7E5E\u8000\u8170\uF9C2\u87EF" +
                        "\u8981\u8B20\u9059\uF9C3\u9080\u9952\u617E\u6B32" +
                        "\u6D74\u7E1F\u8925\u8FB1\u4FD1\u50AD\u5197\u52C7" +
                        "\u57C7\u5889\u5BB9\u5EB8\u6142\u6995\u6D8C\u6E67" +
                        "\u6EB6\u7194\u7462\u7528\u752C\u8073\u8338\u84C9" +
                        "\u8E0A\u9394\u93DE\uF9C4\u4E8E\u4F51\u5076\u512A" +
                        "\u53C8\u53CB\u53F3\u5B87\u5BD3\u5C24\u611A\u6182" +
                        "\u65F4\u725B\u7397\u7440\u76C2\u7950\u7991\u79B9" +
                        "\u7D06\u7FBD\u828B\u85D5\u865E\u8FC2\u9047\u90F5" +
                        "\u91EA\u9685\u96E8\u96E9\u52D6\u5F67\u65ED\u6631" +
                        "\u682F\u715C\u7A36\u90C1\u980A\u4E91\uF9C5\u6A52" +
                        "\u6B9E\u6F90\u7189\u8018\u82B8\u8553",
                "\u904B\u9695\u96F2\u97FB\u851A\u9B31\u4E90\u718A" +
                        "\u96C4\u5143\u539F\u54E1\u5713\u5712\u57A3\u5A9B" +
                        "\u5AC4\u5BC3\u6028\u613F\u63F4\u6C85\u6D39\u6E72" +
                        "\u6E90\u7230\u733F\u7457\u82D1\u8881\u8F45\u9060" +
                        "\uF9C6\u9662\u9858\u9D1B\u6708\u8D8A\u925E\u4F4D" +
                        "\u5049\u50DE\u5371\u570D\u59D4\u5A01\u5C09\u6170" +
                        "\u6690\u6E2D\u7232\u744B\u7DEF\u80C3\u840E\u8466" +
                        "\u853F\u875F\u885B\u8918\u8B02\u9055\u97CB\u9B4F" +
                        "\u4E73\u4F91\u5112\u516A\uF9C7\u552F\u55A9\u5B7A" +
                        "\u5BA5\u5E7C\u5E7D\u5EBE\u60A0\u60DF\u6108\u6109" +
                        "\u63C4\u6538\u6709\uF9C8\u67D4\u67DA\uF9C9\u6961" +
                        "\u6962\u6CB9\u6D27\uF9CA\u6E38\uF9CB",
                "\u6FE1\u7336\u7337\uF9CC\u745C\u7531\uF9CD\u7652" +
                        "\uF9CE\uF9CF\u7DAD\u81FE\u8438\u88D5\u8A98\u8ADB" +
                        "\u8AED\u8E30\u8E42\u904A\u903E\u907A\u9149\u91C9" +
                        "\u936E\uF9D0\uF9D1\u5809\uF9D2\u6BD3\u8089\u80B2" +
                        "\uF9D3\uF9D4\u5141\u596B\u5C39\uF9D5\uF9D6\u6F64" +
                        "\u73A7\u80E4\u8D07\uF9D7\u9217\u958F\uF9D8\uF9D9" +
                        "\uF9DA\uF9DB\u807F\u620E\u701C\u7D68\u878D\uF9DC" +
                        "\u57A0\u6069\u6147\u6BB7\u8ABE\u9280\u96B1\u4E59" +
                        "\u541F\u6DEB\u852D\u9670\u97F3\u98EE\u63D6\u6CE3" +
                        "\u9091\u51DD\u61C9\u81BA\u9DF9\u4F9D\u501A\u5100" +
                        "\u5B9C\u610F\u61FF\u64EC\u6905\u6BC5\u7591\u77E3" +
                        "\u7FA9\u8264\u858F\u87FB\u8863\u8ABC",
                "\u8B70\u91AB\u4E8C\u4EE5\u4F0A\uF9DD\uF9DE\u5937" +
                        "\u59E8\uF9DF\u5DF2\u5F1B\u5F5B\u6021\uF9E0\uF9E1" +
                        "\uF9E2\uF9E3\u723E\u73E5\uF9E4\u7570\u75CD\uF9E5" +
                        "\u79FB\uF9E6\u800C\u8033\u8084\u82E1\u8351\uF9E7" +
                        "\uF9E8\u8CBD\u8CB3\u9087\uF9E9\uF9EA\u98F4\u990C" +
                        "\uF9EB\uF9EC\u7037\u76CA\u7FCA\u7FCC\u7FFC\u8B1A" +
                        "\u4EBA\u4EC1\u5203\u5370\uF9ED\u54BD\u56E0\u59FB" +
                        "\u5BC5\u5F15\u5FCD\u6E6E\uF9EE\uF9EF\u7D6A\u8335" +
                        "\uF9F0\u8693\u8A8D\uF9F1\u976D\u9777\uF9F2\uF9F3" +
                        "\u4E00\u4F5A\u4F7E\u58F9\u65E5\u6EA2\u9038\u93B0" +
                        "\u99B9\u4EFB\u58EC\u598A\u59D9\u6041\uF9F4\uF9F5" +
                        "\u7A14\uF9F6\u834F\u8CC3\u5165\u5344",
                "\uF9F7\uF9F8\uF9F9\u4ECD\u5269\u5B55\u82BF\u4ED4" +
                        "\u523A\u54A8\u59C9\u59FF\u5B50\u5B57\u5B5C\u6063" +
                        "\u6148\u6ECB\u7099\u716E\u7386\u74F7\u75B5\u78C1" +
                        "\u7D2B\u8005\u81EA\u8328\u8517\u85C9\u8AEE\u8CC7" +
                        "\u96CC\u4F5C\u52FA\u56BC\u65AB\u6628\u707C\u70B8" +
                        "\u7235\u7DBD\u828D\u914C\u96C0\u9D72\u5B71\u68E7" +
                        "\u6B98\u6F7A\u76DE\u5C91\u66AB\u6F5B\u7BB4\u7C2A" +
                        "\u8836\u96DC\u4E08\u4ED7\u5320\u5834\u58BB\u58EF" +
                        "\u596C\u5C07\u5E33\u5E84\u5F35\u638C\u66B2\u6756" +
                        "\u6A1F\u6AA3\u6B0C\u6F3F\u7246\uF9FA\u7350\u748B" +
                        "\u7AE0\u7CA7\u8178\u81DF\u81E7\u838A\u846C\u8523" +
                        "\u8594\u85CF\u88DD\u8D13\u91AC\u9577",
                "\u969C\u518D\u54C9\u5728\u5BB0\u624D\u6750\u683D" +
                        "\u6893\u6E3D\u6ED3\u707D\u7E21\u88C1\u8CA1\u8F09" +
                        "\u9F4B\u9F4E\u722D\u7B8F\u8ACD\u931A\u4F47\u4F4E" +
                        "\u5132\u5480\u59D0\u5E95\u62B5\u6775\u696E\u6A17" +
                        "\u6CAE\u6E1A\u72D9\u732A\u75BD\u7BB8\u7D35\u82E7" +
                        "\u83F9\u8457\u85F7\u8A5B\u8CAF\u8E87\u9019\u90B8" +
                        "\u96CE\u9F5F\u52E3\u540A\u5AE1\u5BC2\u6458\u6575" +
                        "\u6EF4\u72C4\uF9FB\u7684\u7A4D\u7B1B\u7C4D\u7E3E" +
                        "\u7FDF\u837B\u8B2B\u8CCA\u8D64\u8DE1\u8E5F\u8FEA" +
                        "\u8FF9\u9069\u93D1\u4F43\u4F7A\u50B3\u5168\u5178" +
                        "\u524D\u526A\u5861\u587C\u5960\u5C08\u5C55\u5EDB" +
                        "\u609B\u6230\u6813\u6BBF\u6C08\u6FB1",
                "\u714E\u7420\u7530\u7538\u7551\u7672\u7B4C\u7B8B" +
                        "\u7BAD\u7BC6\u7E8F\u8A6E\u8F3E\u8F49\u923F\u9293" +
                        "\u9322\u942B\u96FB\u985A\u986B\u991E\u5207\u622A" +
                        "\u6298\u6D59\u7664\u7ACA\u7BC0\u7D76\u5360\u5CBE" +
                        "\u5E97\u6F38\u70B9\u7C98\u9711\u9B8E\u9EDE\u63A5" +
                        "\u647A\u8776\u4E01\u4E95\u4EAD\u505C\u5075\u5448" +
                        "\u59C3\u5B9A\u5E40\u5EAD\u5EF7\u5F81\u60C5\u633A" +
                        "\u653F\u6574\u65CC\u6676\u6678\u67FE\u6968\u6A89" +
                        "\u6B63\u6C40\u6DC0\u6DE8\u6E1F\u6E5E\u701E\u70A1" +
                        "\u738E\u73FD\u753A\u775B\u7887\u798E\u7A0B\u7A7D" +
                        "\u7CBE\u7D8E\u8247\u8A02\u8AEA\u8C9E\u912D\u914A" +
                        "\u91D8\u9266\u92CC\u9320\u9706\u9756",
                "\u975C\u9802\u9F0E\u5236\u5291\u557C\u5824\u5E1D" +
                        "\u5F1F\u608C\u63D0\u68AF\u6FDF\u796D\u7B2C\u81CD" +
                        "\u85BA\u88FD\u8AF8\u8E44\u918D\u9664\u969B\u973D" +
                        "\u984C\u9F4A\u4FCE\u5146\u51CB\u52A9\u5632\u5F14" +
                        "\u5F6B\u63AA\u64CD\u65E9\u6641\u66FA\u66F9\u671D" +
                        "\u689D\u68D7\u69FD\u6F15\u6F6E\u7167\u71E5\u722A" +
                        "\u74AA\u773A\u7956\u795A\u79DF\u7A20\u7A95\u7C97" +
                        "\u7CDF\u7D44\u7E70\u8087\u85FB\u86A4\u8A54\u8ABF" +
                        "\u8D99\u8E81\u9020\u906D\u91E3\u963B\u96D5\u9CE5" +
                        "\u65CF\u7C07\u8DB3\u93C3\u5B58\u5C0A\u5352\u62D9" +
                        "\u731D\u5027\u5B97\u5F9E\u60B0\u616B\u68D5\u6DD9" +
                        "\u742E\u7A2E\u7D42\u7D9C\u7E31\u816B",
                "\u8E2A\u8E35\u937E\u9418\u4F50\u5750\u5DE6\u5EA7" +
                        "\u632B\u7F6A\u4E3B\u4F4F\u4F8F\u505A\u59DD\u80C4" +
                        "\u546A\u5468\u55FE\u594F\u5B99\u5DDE\u5EDA\u665D" +
                        "\u6731\u67F1\u682A\u6CE8\u6D32\u6E4A\u6F8D\u70B7" +
                        "\u73E0\u7587\u7C4C\u7D02\u7D2C\u7DA2\u821F\u86DB" +
                        "\u8A3B\u8A85\u8D70\u8E8A\u8F33\u9031\u914E\u9152" +
                        "\u9444\u99D0\u7AF9\u7CA5\u4FCA\u5101\u51C6\u57C8" +
                        "\u5BEF\u5CFB\u6659\u6A3D\u6D5A\u6E96\u6FEC\u710C" +
                        "\u756F\u7AE3\u8822\u9021\u9075\u96CB\u99FF\u8301" +
                        "\u4E2D\u4EF2\u8846\u91CD\u537D\u6ADB\u696B\u6C41" +
                        "\u847A\u589E\u618E\u66FE\u62EF\u70DD\u7511\u75C7" +
                        "\u7E52\u84B8\u8B49\u8D08\u4E4B\u53EA",
                "\u54AB\u5730\u5740\u5FD7\u6301\u6307\u646F\u652F" +
                        "\u65E8\u667A\u679D\u67B3\u6B62\u6C60\u6C9A\u6F2C" +
                        "\u77E5\u7825\u7949\u7957\u7D19\u80A2\u8102\u81F3" +
                        "\u829D\u82B7\u8718\u8A8C\uF9FC\u8D04\u8DBE\u9072" +
                        "\u76F4\u7A19\u7A37\u7E54\u8077\u5507\u55D4\u5875" +
                        "\u632F\u6422\u6649\u664B\u686D\u699B\u6B84\u6D25" +
                        "\u6EB1\u73CD\u7468\u74A1\u755B\u75B9\u76E1\u771E" +
                        "\u778B\u79E6\u7E09\u7E1D\u81FB\u852F\u8897\u8A3A" +
                        "\u8CD1\u8EEB\u8FB0\u9032\u93AD\u9663\u9673\u9707" +
                        "\u4F84\u53F1\u59EA\u5AC9\u5E19\u684E\u74C6\u75BE" +
                        "\u79E9\u7A92\u81A3\u86ED\u8CEA\u8DCC\u8FED\u659F" +
                        "\u6715\uF9FD\u57F7\u6F57\u7DDD\u8F2F",
                "\u93F6\u96C6\u5FB5\u61F2\u6F84\u4E14\u4F98\u501F" +
                        "\u53C9\u55DF\u5D6F\u5DEE\u6B21\u6B64\u78CB\u7B9A" +
                        "\uF9FE\u8E49\u8ECA\u906E\u6349\u643E\u7740\u7A84" +
                        "\u932F\u947F\u9F6A\u64B0\u6FAF\u71E6\u74A8\u74DA" +
                        "\u7AC4\u7C12\u7E82\u7CB2\u7E98\u8B9A\u8D0A\u947D" +
                        "\u9910\u994C\u5239\u5BDF\u64E6\u672D\u7D2E\u50ED" +
                        "\u53C3\u5879\u6158\u6159\u61FA\u65AC\u7AD9\u8B92" +
                        "\u8B96\u5009\u5021\u5275\u5531\u5A3C\u5EE0\u5F70" +
                        "\u6134\u655E\u660C\u6636\u66A2\u69CD\u6EC4\u6F32" +
                        "\u7316\u7621\u7A93\u8139\u8259\u83D6\u84BC\u50B5" +
                        "\u57F0\u5BC0\u5BE8\u5F69\u63A1\u7826\u7DB5\u83DC" +
                        "\u8521\u91C7\u91F5\u518A\u67F5\u7B56",
                "\u8CAC\u51C4\u59BB\u60BD\u8655\u501C\uF9FF\u5254" +
                        "\u5C3A\u617D\u621A\u62D3\u64F2\u65A5\u6ECC\u7620" +
                        "\u810A\u8E60\u965F\u96BB\u4EDF\u5343\u5598\u5929" +
                        "\u5DDD\u64C5\u6CC9\u6DFA\u7394\u7A7F\u821B\u85A6" +
                        "\u8CE4\u8E10\u9077\u91E7\u95E1\u9621\u97C6\u51F8" +
                        "\u54F2\u5586\u5FB9\u64A4\u6F88\u7DB4\u8F1F\u8F4D" +
                        "\u9435\u50C9\u5C16\u6CBE\u6DFB\u751B\u77BB\u7C3D" +
                        "\u7C64\u8A79\u8AC2\u581E\u59BE\u5E16\u6377\u7252" +
                        "\u758A\u776B\u8ADC\u8CBC\u8F12\u5EF3\u6674\u6DF8" +
                        "\u807D\u83C1\u8ACB\u9751\u9BD6\uFA00\u5243\u66FF" +
                        "\u6D95\u6EEF\u7DE0\u8AE6\u902E\u905E\u9AD4\u521D" +
                        "\u527F\u54E8\u6194\u6284\u62DB\u68A2",
                "\u6912\u695A\u6A35\u7092\u7126\u785D\u7901\u790E" +
                        "\u79D2\u7A0D\u8096\u8278\u82D5\u8349\u8549\u8C82" +
                        "\u8D85\u9162\u918B\u91AE\u4FC3\u56D1\u71ED\u77D7" +
                        "\u8700\u89F8\u5BF8\u5FD6\u6751\u90A8\u53E2\u585A" +
                        "\u5BF5\u60A4\u6181\u6460\u7E3D\u8070\u8525\u9283" +
                        "\u64AE\u50AC\u5D14\u6700\u589C\u62BD\u63A8\u690E" +
                        "\u6978\u6A1E\u6E6B\u76BA\u79CB\u82BB\u8429\u8ACF" +
                        "\u8DA8\u8FFD\u9112\u914B\u919C\u9310\u9318\u939A" +
                        "\u96DB\u9A36\u9C0D\u4E11\u755C\u795D\u7AFA\u7B51" +
                        "\u7BC9\u7E2E\u84C4\u8E59\u8E74\u8EF8\u9010\u6625" +
                        "\u693F\u7443\u51FA\u672E\u9EDC\u5145\u5FE0\u6C96" +
                        "\u87F2\u885D\u8877\u60B4\u81B5\u8403",
                "\u8D05\u53D6\u5439\u5634\u5A36\u5C31\u708A\u7FE0" +
                        "\u805A\u8106\u81ED\u8DA3\u9189\u9A5F\u9DF2\u5074" +
                        "\u4EC4\u53A0\u60FB\u6E2C\u5C64\u4F88\u5024\u55E4" +
                        "\u5CD9\u5E5F\u6065\u6894\u6CBB\u6DC4\u71BE\u75D4" +
                        "\u75F4\u7661\u7A1A\u7A49\u7DC7\u7DFB\u7F6E\u81F4" +
                        "\u86A9\u8F1C\u96C9\u99B3\u9F52\u5247\u52C5\u98ED" +
                        "\u89AA\u4E03\u67D2\u6F06\u4FB5\u5BE2\u6795\u6C88" +
                        "\u6D78\u741B\u7827\u91DD\u937C\u87C4\u79E4\u7A31" +
                        "\u5FEB\u4ED6\u54A4\u553E\u58AE\u59A5\u60F0\u6253" +
                        "\u62D6\u6736\u6955\u8235\u9640\u99B1\u99DD\u502C" +
                        "\u5353\u5544\u577C\uFA01\u6258\uFA02\u64E2\u666B" +
                        "\u67DD\u6FC1\u6FEF\u7422\u7438\u8A17",
                "\u9438\u5451\u5606\u5766\u5F48\u619A\u6B4E\u7058" +
                        "\u70AD\u7DBB\u8A95\u596A\u812B\u63A2\u7708\u803D" +
                        "\u8CAA\u5854\u642D\u69BB\u5B95\u5E11\u6E6F\uFA03" +
                        "\u8569\u514C\u53F0\u592A\u6020\u614B\u6B86\u6C70" +
                        "\u6CF0\u7B1E\u80CE\u82D4\u8DC6\u90B0\u98B1\uFA04" +
                        "\u64C7\u6FA4\u6491\u6504\u514E\u5410\u571F\u8A0E" +
                        "\u615F\u6876\uFA05\u75DB\u7B52\u7D71\u901A\u5806" +
                        "\u69CC\u817F\u892A\u9000\u9839\u5078\u5957\u59AC" +
                        "\u6295\u900F\u9B2A\u615D\u7279\u95D6\u5761\u5A46" +
                        "\u5DF4\u628A\u64AD\u64FA\u6777\u6CE2\u6D3E\u722C" +
                        "\u7436\u7834\u7F77\u82AD\u8DDB\u9817\u5224\u5742" +
                        "\u677F\u7248\u74E3\u8CA9\u8FA6\u9211",
                "\u962A\u516B\u53ED\u634C\u4F69\u5504\u6096\u6557" +
                        "\u6C9B\u6D7F\u724C\u72FD\u7A17\u8987\u8C9D\u5F6D" +
                        "\u6F8E\u70F9\u81A8\u610E\u4FBF\u504F\u6241\u7247" +
                        "\u7BC7\u7DE8\u7FE9\u904D\u97AD\u9A19\u8CB6\u576A" +
                        "\u5E73\u67B0\u840D\u8A55\u5420\u5B16\u5E63\u5EE2" +
                        "\u5F0A\u6583\u80BA\u853D\u9589\u965B\u4F48\u5305" +
                        "\u530D\u530F\u5486\u54FA\u5703\u5E03\u6016\u629B" +
                        "\u62B1\u6355\uFA06\u6CE1\u6D66\u75B1\u7832\u80DE" +
                        "\u812F\u82DE\u8461\u84B2\u888D\u8912\u900B\u92EA" +
                        "\u98FD\u9B91\u5E45\u66B4\u66DD\u7011\u7206\uFA07" +
                        "\u4FF5\u527D\u5F6A\u6153\u6753\u6A19\u6F02\u74E2" +
                        "\u7968\u8868\u8C79\u98C7\u98C4\u9A43",
                "\u54C1\u7A1F\u6953\u8AF7\u8C4A\u98A8\u99AE\u5F7C" +
                        "\u62AB\u75B2\u76AE\u88AB\u907F\u9642\u5339\u5F3C" +
                        "\u5FC5\u6CCC\u73CC\u7562\u758B\u7B46\u82FE\u999D" +
                        "\u4E4F\u903C\u4E0B\u4F55\u53A6\u590F\u5EC8\u6630" +
                        "\u6CB3\u7455\u8377\u8766\u8CC0\u9050\u971E\u9C15" +
                        "\u58D1\u5B78\u8650\u8B14\u9DB4\u5BD2\u6068\u608D" +
                        "\u65F1\u6C57\u6F22\u6FA3\u701A\u7F55\u7FF0\u9591" +
                        "\u9592\u9650\u97D3\u5272\u8F44\u51FD\u542B\u54B8" +
                        "\u5563\u558A\u6ABB\u6DB5\u7DD8\u8266\u929C\u9677" +
                        "\u9E79\u5408\u54C8\u76D2\u86E4\u95A4\u95D4\u965C" +
                        "\u4EA2\u4F09\u59EE\u5AE6\u5DF7\u6052\u6297\u676D" +
                        "\u6841\u6C86\u6E2F\u7F38\u809B\u822A",
                "\uFA08\uFA09\u9805\u4EA5\u5055\u54B3\u5793\u595A" +
                        "\u5B69\u5BB3\u61C8\u6977\u6D77\u7023\u87F9\u89E3" +
                        "\u8A72\u8AE7\u9082\u99ED\u9AB8\u52BE\u6838\u5016" +
                        "\u5E78\u674F\u8347\u884C\u4EAB\u5411\u56AE\u73E6" +
                        "\u9115\u97FF\u9909\u9957\u9999\u5653\u589F\u865B" +
                        "\u8A31\u61B2\u6AF6\u737B\u8ED2\u6B47\u96AA\u9A57" +
                        "\u5955\u7200\u8D6B\u9769\u4FD4\u5CF4\u5F26\u61F8" +
                        "\u665B\u6CEB\u70AB\u7384\u73B9\u73FE\u7729\u774D" +
                        "\u7D43\u7D62\u7E23\u8237\u8852\uFA0A\u8CE2\u9249" +
                        "\u986F\u5B51\u7A74\u8840\u9801\u5ACC\u4FE0\u5354" +
                        "\u593E\u5CFD\u633E\u6D79\u72F9\u8105\u8107\u83A2" +
                        "\u92CF\u9830\u4EA8\u5144\u5211\u578B",
                "\u5F62\u6CC2\u6ECE\u7005\u7050\u70AF\u7192\u73E9" +
                        "\u7469\u834A\u87A2\u8861\u9008\u90A2\u93A3\u99A8" +
                        "\u516E\u5F57\u60E0\u6167\u66B3\u8559\u8E4A\u91AF" +
                        "\u978B\u4E4E\u4E92\u547C\u58D5\u58FA\u597D\u5CB5" +
                        "\u5F27\u6236\u6248\u660A\u6667\u6BEB\u6D69\u6DCF" +
                        "\u6E56\u6EF8\u6F94\u6FE0\u6FE9\u705D\u72D0\u7425" +
                        "\u745A\u74E0\u7693\u795C\u7CCA\u7E1E\u80E1\u82A6" +
                        "\u846B\u84BF\u864E\u865F\u8774\u8B77\u8C6A\u93AC" +
                        "\u9800\u9865\u60D1\u6216\u9177\u5A5A\u660F\u6DF7" +
                        "\u6E3E\u743F\u9B42\u5FFD\u60DA\u7B0F\u54C4\u5F18" +
                        "\u6C5E\u6CD3\u6D2A\u70D8\u7D05\u8679\u8A0C\u9D3B" +
                        "\u5316\u548C\u5B05\u6A3A\u706B\u7575",
                "\u798D\u79BE\u82B1\u83EF\u8A71\u8B41\u8CA8\u9774" +
                        "\uFA0B\u64F4\u652B\u78BA\u78BB\u7A6B\u4E38\u559A" +
                        "\u5950\u5BA6\u5E7B\u60A3\u63DB\u6B61\u6665\u6853" +
                        "\u6E19\u7165\u74B0\u7D08\u9084\u9A69\u9C25\u6D3B" +
                        "\u6ED1\u733E\u8C41\u95CA\u51F0\u5E4C\u5FA8\u604D" +
                        "\u60F6\u6130\u614C\u6643\u6644\u69A5\u6CC1\u6E5F" +
                        "\u6EC9\u6F62\u714C\u749C\u7687\u7BC1\u7C27\u8352" +
                        "\u8757\u9051\u968D\u9EC3\u532F\u56DE\u5EFB\u5F8A" +
                        "\u6062\u6094\u61F7\u6666\u6703\u6A9C\u6DEE\u6FAE" +
                        "\u7070\u736A\u7E6A\u81BE\u8334\u86D4\u8AA8\u8CC4" +
                        "\u5283\u7372\u5B96\u6A6B\u9404\u54EE\u5686\u5B5D" +
                        "\u6548\u6585\u66C9\u689F\u6D8D\u6DC6",
                "\u723B\u80B4\u9175\u9A4D\u4FAF\u5019\u539A\u540E" +
                        "\u543C\u5589\u55C5\u5E3F\u5F8C\u673D\u7166\u73DD" +
                        "\u9005\u52DB\u52F3\u5864\u58CE\u7104\u718F\u71FB" +
                        "\u85B0\u8A13\u6688\u85A8\u55A7\u6684\u714A\u8431" +
                        "\u5349\u5599\u6BC1\u5F59\u5FBD\u63EE\u6689\u7147" +
                        "\u8AF1\u8F1D\u9EBE\u4F11\u643A\u70CB\u7566\u8667" +
                        "\u6064\u8B4E\u9DF8\u5147\u51F6\u5308\u6D36\u80F8" +
                        "\u9ED1\u6615\u6B23\u7098\u75D5\u5403\u5C79\u7D07" +
                        "\u8A16\u6B20\u6B3D\u6B46\u5438\u6070\u6D3D\u7FD5" +
                        "\u8208\u50D6\u51DE\u559C\u566B\u56CD\u59EC\u5B09" +
                        "\u5E0C\u6199\u6198\u6231\u665E\u66E6\u7199\u71B9" +
                        "\u71BA\u72A7\u79A7\u7A00\u7FB2\u8A70",
                null,
                null,
            )

            val b2c: Array<CharArray?> = Array(b2cStr.size) {
                if (b2cStr[it] == null) {
                    DoubleByte.B2C_UNMAPPABLE
                } else {
                    b2cStr[it]!!.toCharArray()
                }
            }

            val b2cSB: CharArray = b2cSBStr.toCharArray()
        }

        internal object EncodeHolder {
            val c2b: CharArray = CharArray(0x9200)
            val c2bIndex: CharArray = CharArray(0x100)

            init {
                val b2cNR: String? = null
                val c2bNR: String? = null
                DoubleByte.Encoder.initC2B(
                    DecodeHolder.b2cStr, DecodeHolder.b2cSBStr,
                    b2cNR, c2bNR,
                    0xa1, 0xfe,
                    c2b, c2bIndex
                )
            }
        }
    }
}