package com.fleeksoft.charset.io

expect open class IOException() : Exception
expect class ReadOnlyBufferException() : UnsupportedOperationException
expect open class CharacterCodingException() : IOException
expect class BufferUnderflowException() : RuntimeException
expect class BufferOverflowException() : RuntimeException
expect class MalformedInputException(inputLength: Int) : CharacterCodingException
expect class UnmappableCharacterException(inputLength: Int)
expect class CoderMalfunctionError(cause: Exception) : Error