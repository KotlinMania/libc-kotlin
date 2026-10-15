package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class SockaddrAlg(
    val salgFamily: UShort,
    val salgType: UByteArray,
    val salgFeat: UInt,
    val salgMask: UInt,
    val salgName: UByteArray,
)
