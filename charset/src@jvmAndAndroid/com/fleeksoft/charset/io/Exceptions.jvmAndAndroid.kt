package com.fleeksoft.charset.io

actual typealias IOException = java.io.IOException
actual typealias ReadOnlyBufferException = java.nio.ReadOnlyBufferException
actual typealias CharacterCodingException = java.nio.charset.CharacterCodingException
actual typealias BufferUnderflowException = java.nio.BufferUnderflowException
actual typealias BufferOverflowException = java.nio.BufferOverflowException
actual typealias MalformedInputException = java.nio.charset.MalformedInputException
actual typealias UnmappableCharacterException = java.nio.charset.UnmappableCharacterException
actual typealias CoderMalfunctionError = java.nio.charset.CoderMalfunctionError