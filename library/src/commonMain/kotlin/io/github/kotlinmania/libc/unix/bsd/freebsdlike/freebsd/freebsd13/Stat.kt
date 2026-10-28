package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: ULong,
    val stIno: ULong,
    val stNlink: ULong,
    val stMode: UInt,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stAtimExt: Int,
    val stAtime: Long,
    val stAtimeNsec: Long,
    val stMtimExt: Int,
    val stMtime: Long,
    val stMtimeNsec: Long,
    val stCtimExt: Int,
    val stCtime: Long,
    val stCtimeNsec: Long,
    val stBtimExt: Int,
    val stBirthtime: Long,
    val stBirthtimeNsec: Long,
    val stSize: Long,
    val stBlocks: Long,
    val stBlksize: Long,
    val stFlags: UInt,
    val stGen: ULong,
    val stSpare: ULongArray,
)
