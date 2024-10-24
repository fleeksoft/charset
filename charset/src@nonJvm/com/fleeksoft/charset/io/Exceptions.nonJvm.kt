package com.fleeksoft.charset.io

actual open class IOException actual constructor() : Exception()
actual class ReadOnlyBufferException actual constructor() : UnsupportedOperationException()
actual open class CharacterCodingException actual constructor() : IOException()
actual class BufferUnderflowException actual constructor() : RuntimeException()
actual class BufferOverflowException actual constructor() : RuntimeException()
actual class MalformedInputException actual constructor(inputLength: Int) : CharacterCodingException() {
    override val message: String? = "Input length = $inputLength"
}

actual class UnmappableCharacterException actual constructor(inputLength: Int) : Exception() {
    override val message: String? = "Input length = $inputLength"
}

actual class CoderMalfunctionError actual constructor(cause: Exception) : Error(cause)