package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Ifdownreason(
    val ifdrName: ByteArray,
    val ifdrReason: UInt,
    val ifdrVendor: UInt,
    val ifdrMsg: ByteArray,
)
