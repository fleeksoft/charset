package com.fleeksoft.charset.io

class ReadOnlyException : Exception()
class BufferUnderflowException : Exception()
class BufferOverflowException : Exception()
class MalformedInputException(inputLength: Int) : Exception() {
    override val message: String? = "Input length = $inputLength"
}
class UnmappableCharacterException(inputLength: Int) : Exception() {
    override val message: String? = "Input length = $inputLength"
}

class CoderMalfunctionError(cause: Throwable): Exception(cause)