package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class TpacketBdTs(
    val tsSec: UInt,
    val tsUsec: UInt,
)
