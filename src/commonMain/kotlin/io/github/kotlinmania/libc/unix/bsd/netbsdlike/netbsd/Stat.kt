package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: ULong,
    val stMode: UInt,
    val stIno: ULong,
    val stNlink: ULong,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stAtime: Long,
    val stAtimensec: Long,
    val stMtime: Long,
    val stMtimensec: Long,
    val stCtime: Long,
    val stCtimensec: Long,
    val stBirthtime: Long,
    val stBirthtimensec: Long,
    val stSize: Long,
    val stBlocks: Long,
    val stBlksize: Int,
    val stFlags: UInt,
    val stGen: UInt,
    val stSpare: UIntArray,
)
