package com.fleeksoft.charset.io

expect class ReadOnlyBufferException() : Exception
expect class BufferUnderflowException() : Exception
expect class BufferOverflowException() : Exception
expect class MalformedInputException(inputLength: Int) : Exception
expect class UnmappableCharacterException(inputLength: Int) : Exception
expect class CoderMalfunctionError(cause: Exception) : Error