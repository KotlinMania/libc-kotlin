package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpPcbinfo(
    val epCount: UInt,
    val asocCount: UInt,
    val laddrCount: UInt,
    val raddrCount: UInt,
    val chkCount: UInt,
    val readqCount: UInt,
    val freeChunks: UInt,
    val streamOque: UInt,
)
