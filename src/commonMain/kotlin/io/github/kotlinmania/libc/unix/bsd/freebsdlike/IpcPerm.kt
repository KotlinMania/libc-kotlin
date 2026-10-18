package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public data class IpcPerm(
    val cuid: UInt,
    val cgid: UInt,
    val uid: UInt,
    val gid: UInt,
    val mode: UShort,
    val seq: UShort,
    val key: Long,
)
