package com.fleeksoft.charset

enum class PlatformType {
    ANDROID,
    JVM,
    IOS,
    APPLE,
    LINUX,
    JS,
    MAC,
    WINDOWS,
    WASM,
}

expect object Platform {
    val current: PlatformType
}


internal fun Platform.isApple(): Boolean = this.current == PlatformType.APPLE || this.current == PlatformType.IOS || this.current == PlatformType.MAC

fun Platform.isWindows(): Boolean = this.current == PlatformType.WINDOWS

internal fun Platform.isLinux(): Boolean = this.current == PlatformType.LINUX

internal fun Platform.isJvmOrAndroid(): Boolean = this.current == PlatformType.JVM || this.current == PlatformType.ANDROID

internal fun Platform.isJvm(): Boolean = this.current == PlatformType.JVM

internal fun Platform.isJsOrWasm(): Boolean = this.current == PlatformType.JS || this.current == PlatformType.WASM

internal fun Platform.isWasmJs(): Boolean = this.current == PlatformType.WASM