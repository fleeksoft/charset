package com.fleeksoft.charset

import com.fleeksoft.charset.internal.CharsetNameMapping
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class CharsetMappingTest {
    @Test
    fun testStandardCharsetsMapping() {
        CharsetNameMapping.standardCharsetMapKeys.keys.forEach { key ->
            val charset = Charsets.forName(key)
            assertNotNull(charset)
            assertEquals(charset.name(), CharsetNameMapping.standardCharsetMapKeys[key])
        }
    }


    @Test
    fun testExtendedCharsetsMapping() {
        CharsetNameMapping.extendedCharsetMapKeys.keys.forEach { key ->
            val charset = Charsets.forName(key)
            assertNotNull(charset)
            assertEquals(charset.name(), CharsetNameMapping.extendedCharsetMapKeys[key])
        }
    }
}