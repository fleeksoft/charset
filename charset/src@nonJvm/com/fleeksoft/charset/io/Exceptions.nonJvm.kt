package com.fleeksoft.charset.io

actual class ReadOnlyBufferException actual constructor() : Exception()
actual class BufferUnderflowException actual constructor() : Exception()
actual class BufferOverflowException actual constructor() : Exception()
actual class MalformedInputException actual constructor(inputLength: Int) : Exception() {
    override val message: String? = "Input length = $inputLength"
}

actual class UnmappableCharacterException actual constructor(inputLength: Int) : Exception() {
    override val message: String? = "Input length = $inputLength"
}

actual class CoderMalfunctionError actual constructor(cause: Exception) : Error(cause)