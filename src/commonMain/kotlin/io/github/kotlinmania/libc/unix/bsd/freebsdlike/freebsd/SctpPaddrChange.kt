package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SockaddrStorage

import io.github.kotlinmania.libc.*

public data class SctpPaddrChange(
    val spcType: UShort,
    val spcFlags: UShort,
    val spcLength: UInt,
    val spcAaddr: SockaddrStorage,
    val spcState: UInt,
    val spcError: UInt,
    val spcAssocId: UInt,
)
