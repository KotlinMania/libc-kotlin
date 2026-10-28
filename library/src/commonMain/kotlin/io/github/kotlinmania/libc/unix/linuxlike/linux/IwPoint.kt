package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class IwPoint(
    val pointer: COpaquePointer?,
    val length: UShort,
    val flags: UShort,
)
