package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class InputMask(
    val type: UInt,
    val codesSize: UInt,
    val codesPtr: ULong,
)
