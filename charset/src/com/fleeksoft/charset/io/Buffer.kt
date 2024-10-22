package com.fleeksoft.charset.io

expect abstract class Buffer {
    fun remaining(): Int
    fun capacity(): Int
    fun limit(): Int
    open fun limit(newLimit: Int): Buffer
    abstract fun isReadOnly(): Boolean
    fun position(): Int
    open fun position(pos: Int): Buffer
    open fun flip(): Buffer
    open fun clear(): Buffer
    fun hasRemaining(): Boolean
    open fun mark(): Buffer
    open fun reset(): Buffer
    open fun rewind(): Buffer
    abstract fun arrayOffset(): Int
    abstract fun array(): Any
    abstract fun slice(): Buffer
    abstract fun slice(index: Int, length: Int): Buffer
    abstract fun duplicate(): Buffer
}