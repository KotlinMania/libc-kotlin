package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class IwPrivArgs(
    val cmd: UInt,
    val setArgs: UShort,
    val getArgs: UShort,
    val name: ByteArray,
)
