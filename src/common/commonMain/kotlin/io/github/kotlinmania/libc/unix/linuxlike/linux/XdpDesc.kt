package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class XdpDesc(
    val addr: ULong,
    val len: UInt,
    val options: UInt,
)
