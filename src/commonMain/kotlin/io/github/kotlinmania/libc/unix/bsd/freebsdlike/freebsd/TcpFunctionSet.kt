package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class TcpFunctionSet(
    val functionSetName: ByteArray,
    val pcbcnt: UInt,
)
