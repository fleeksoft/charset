package com.fleeksoft.charset.io

expect abstract class Buffer {
    fun remaining(): Int
    fun capacity(): Int
    fun limit(): Int

    abstract fun isReadOnly(): Boolean
    fun position(): Int
    fun hasRemaining(): Boolean
    abstract fun arrayOffset(): Int

    abstract fun array(): Any
    abstract fun hasArray(): Boolean
}