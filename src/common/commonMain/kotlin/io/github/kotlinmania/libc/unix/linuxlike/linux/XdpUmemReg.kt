package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class XdpUmemReg(
    val addr: ULong,
    val len: ULong,
    val chunkSize: UInt,
    val headroom: UInt,
    val flags: UInt,
    val txMetadataLen: UInt,
)
