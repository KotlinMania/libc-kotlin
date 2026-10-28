package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class PortEvent(
    val portevEvents: Int,
    val portevSource: UShort,
    val portevPad: UShort,
    val portevObject: ULong,
    val portevUser: COpaquePointer?,
)
