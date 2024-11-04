# Kotlin Multiplatform Charset

A Kotlin Multiplatform library providing support for standard and extended character sets, enabling seamless encoding and decoding across platforms.

[![Kotlin](https://img.shields.io/badge/Kotlin-2.0.21-blue.svg?style=flat&logo=kotlin)](https://kotlinlang.org)
![License: GPL v2](https://img.shields.io/badge/License-GPLv2-blue.svg)
[![Maven Central](https://img.shields.io/maven-central/v/com.fleeksoft.charset/charset.svg)](https://central.sonatype.com/artifact/com.fleeksoft.charset/charset)

![badge-jvm](http://img.shields.io/badge/platform-jvm-DB413D.svg?style=flat)
![badge-android](http://img.shields.io/badge/platform-android-6EDB8D.svg?style=flat)
![badge-ios](http://img.shields.io/badge/platform-ios-CDCDCD.svg?style=flat)
![badge-mac](http://img.shields.io/badge/platform-macos-111111.svg?style=flat)
![badge-tvos](http://img.shields.io/badge/platform-tvos-808080.svg?style=flat)
![badge-tvos](http://img.shields.io/badge/platform-watchos-808080.svg?style=flat)
![badge-linux](http://img.shields.io/badge/platform-linux-2D3F6C.svg?style=flat)
![badge-windows](http://img.shields.io/badge/platform-windows-4D76CD.svg?style=flat)
![badge-js](https://img.shields.io/badge/platform-js-F8DB5D.svg?style=flat)
![badge-wasm](https://img.shields.io/badge/platform-wasm-F8DB5D.svg?style=flat)

## Modules

This library consists of two modules:

1. **charset**:
    - Contains only standard charsets.
    - Ideal for basic character encoding needs.
    - Check [Standard Charsets List](STANDARD_CHARSETS.md)

2. **charset-ext**:
    - Extends the functionality by providing support for additional character sets.
    - Useful for applications that require a broader range of character encoding.
    - Check [Extended Charsets List](EXTENDED_CHARSETS.md)

## Features

- Cross-platform compatibility for mobile, desktop, and web applications.
- Simple API for encoding and decoding strings.
- Lightweight and easy to integrate into your Kotlin projects.

## Installation

Add the following dependencies to your project:

### Gradle
###### Latest Version
[![Maven Central](https://img.shields.io/maven-central/v/com.fleeksoft.charset/charset.svg)](https://central.sonatype.com/artifact/com.fleeksoft.charset/charset)
```kotlin
commonMain.dependencies {
    implementation("com.fleeksoft.charset:charset:<version>") //only standard charsets
   //or
    implementation("com.fleeksoft.charset:charset-ext:<version>") // standard + extended charsets
}
```

## Usage Example

Here is a simple example of how to use the library to encode and decode strings:

### Initializing

You can initialize a `Charset` in two ways:

```kotlin

// Using INSTANCE variable for Standard Charsets
val charset: Charset = UTF_8.INSTANCE // This INSTANCE variable is available only for Standard Charsets

// Or, by using forName method
val charset: Charset = Charsets.forName("UTF-8") // charset name can be any case it will be normalized in lower case and remove `-` and `_`
```

### Encoding & Decoding with Extension Functions
```kotlin
// Encoding
// You can use extension functions to encode a string to a ByteArray:
val inputString = "Hello, World!"
val encodedBytes: ByteArray = inputString.toByteArray(charset) // ext fun from com.fleeksoft.charset.toByteArray
println("Encoded Bytes: ${encodedBytes.joinToString()}")

// Decoding
// You can decode the ByteArray back to a String using an extension function:
val decodedString: String = encodedBytes.decodeToString(charset) // ext from com.fleeksoft.charset.decodeToString
println("Decoded String: $decodedString")
```

### Encoding & Decoding with Default Instance
```kotlin
//encode
val byteArray: ByteBuffer = Charsets.forName("UTF-8").encode("Hello, World!")

//decode
val decodedCharBuffer: CharBuffer = Charsets.forName("UTF-8").decode(byteArray)
```

### Encoding & Decoding by Creating New Encoder and Decoder Instance
```kotlin
//encoding
val encoder = Charsets.forName("UTF-8").newEncoder()
val encodedByteBuffer = encoder.encode(CharBufferFactory.wrap(inputString))

//decoding
val decoder = Charsets.forName("UTF-8").newDecoder()
val decodedCharBuffer1: CharBuffer = decoder.decode(ByteBufferFactory.wrap(encodedBytes))


//decoding with CharArray
val charArray = CharArray(5)
val charBuffer: CharBuffer = CharBufferFactory.wrap(charArray)
decoder.decode(ByteBufferFactory.wrap(encodedBytes), charBuffer, true)
```

## Contributing
Contributions are welcome! Please open an issue or submit a pull request for any enhancements or bug fixes.

## License
This project is licensed under the GNU General Public License v2.0. See the [LICENSE](LICENSE.md) file for more details.