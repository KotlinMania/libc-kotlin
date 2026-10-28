package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class PtpPinDesc(
    val name: ByteArray,
    val index: UInt,
    val func: UInt,
    val chan: UInt,
    val rsv: UIntArray,
)
