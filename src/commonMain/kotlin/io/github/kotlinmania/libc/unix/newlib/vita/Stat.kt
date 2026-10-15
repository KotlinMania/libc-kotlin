package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: ULong,
    val stIno: ULong,
    val stMode: UInt,
    val stNlink: ULong,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stSize: Long,
    val stAtime: Long,
    val stMtime: Long,
    val stCtime: Long,
    val stBlksize: Long,
    val stBlocks: Long,
    val stSpare4: LongArray,
)
