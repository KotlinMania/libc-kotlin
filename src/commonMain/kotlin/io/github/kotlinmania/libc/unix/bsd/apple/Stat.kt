package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: Int,
    val stMode: UShort,
    val stNlink: UShort,
    val stIno: ULong,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: Int,
    val stAtime: Long,
    val stAtimeNsec: Long,
    val stMtime: Long,
    val stMtimeNsec: Long,
    val stCtime: Long,
    val stCtimeNsec: Long,
    val stBirthtime: Long,
    val stBirthtimeNsec: Long,
    val stSize: Long,
    val stBlocks: Long,
    val stBlksize: Int,
    val stFlags: UInt,
    val stGen: UInt,
    val stLspare: Int,
    val stQspare: LongArray,
)
