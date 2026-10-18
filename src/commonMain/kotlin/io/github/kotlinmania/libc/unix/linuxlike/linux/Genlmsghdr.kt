package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class Genlmsghdr(
    val cmd: UByte,
    val version: UByte,
    val reserved: UShort,
)
