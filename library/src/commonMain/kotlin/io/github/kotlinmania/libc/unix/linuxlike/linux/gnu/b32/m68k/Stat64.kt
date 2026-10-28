package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.m68k

import io.github.kotlinmania.libc.*

public data class Stat64(
    val stDev: ULong,
    val stIno: ULong,
    val stMode: UInt,
    val stNlink: ULong,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stSize: Long,
    val stBlksize: Long,
    val stBlocks: Long,
    val stAtime: Long,
    val stAtimeNsec: ULong,
    val stMtime: Long,
    val stMtimeNsec: ULong,
    val stCtime: Long,
    val stCtimeNsec: ULong,
    val stIno2: ULong,
)
