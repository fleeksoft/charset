package com.fleeksoft.charset.io;

import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class ByteBufferTest {

    private lateinit var buffer: ByteBuffer

    @BeforeTest
    fun setUp() {
        // Create a HeapByteBuffer with capacity of 10
        buffer = ByteBuffer.allocate(10)
    }


    @Test
    fun initTest(){
        val b1 = ByteBuffer.allocate(10)
        assertEquals(0, b1.position())
        assertEquals(10, b1.limit())
        assertEquals(10, b1.capacity)
        b1.flip()
        assertEquals(0, b1.limit())

        val b2 = ByteBuffer.wrap(ByteArray(5), 0, 3)
        assertEquals(0, b2.position())
        assertEquals(3, b2.limit())
        assertEquals(5, b2.capacity)
    }

    @Test
    fun testInitialProperties() {
        // Test initial properties
        assertEquals(10, buffer.capacity)
        assertEquals(0, buffer.position())
        assertEquals(10, buffer.limit())
    }

    @Test
    fun testWriteAndRead() {
        // Write a byte and check the position
        buffer.put(1)
        assertEquals(1, buffer.position())

        // Flip the buffer to prepare for reading
        buffer.flip()
        assertEquals(0, buffer.position())
        assertEquals(1, buffer.limit())

        // Read a byte
        val b = buffer.get()
        assertEquals(1, b)
        assertEquals(1, buffer.position())
    }

    @Test
    fun testBufferOverflow() {
        // Test buffer overflow exception
        for (i in 0 until buffer.capacity) {
            buffer.put(i.toByte())
        }

        assertFailsWith<BufferOverflowException> {
            buffer.put(100.toByte())
        }
    }

    @Test
    fun testBufferUnderflow() {
        buffer.put(5)
        buffer.flip()

        // Test reading a byte
        val b = buffer.get()
        assertEquals(5, b)

        // Test buffer underflow exception
        assertFailsWith<Exception> {
            buffer.get()
        }
    }

    @Test
    fun testDuplicateBuffer() {
        buffer.put(42)
        buffer.flip()

        val duplicate = buffer.duplicate()
        assertEquals(buffer.position(), duplicate.position())
        assertEquals(buffer.limit(), duplicate.limit())

        val b = duplicate.get()
        assertEquals(42, b)  // Both buffers share the same content
    }

    @Test
    fun testMarkAndReset() {
        buffer.put(10)
        buffer.put(20)
        buffer.mark()  // Mark position at 2
        buffer.put(30)

        buffer.reset() // Reset to marked position
        assertEquals(2, buffer.position())

        assertEquals(30, buffer.get()) // Read the byte at marked position
    }
}