package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Log2phys(
    val l2pFlags: UInt,
    val l2pContigbytes: Long,
    val l2pDevoffset: Long,
)
