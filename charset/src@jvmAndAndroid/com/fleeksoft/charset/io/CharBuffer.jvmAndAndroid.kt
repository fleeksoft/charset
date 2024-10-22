package com.fleeksoft.charset.io

actual typealias CharBuffer = java.nio.CharBuffer


actual operator fun CharBuffer.get(index: Int): Char = this.get(index)