package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class TpacketBlockDesc(
    val version: UInt,
    val offsetToPriv: UInt,
    val hdr: TpacketBdHeaderU,
)
