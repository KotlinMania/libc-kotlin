package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class XdpRingOffset(
    val producer: ULong,
    val consumer: ULong,
    val desc: ULong,
    val flags: ULong,
)
