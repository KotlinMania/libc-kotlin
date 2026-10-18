package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class Stat(
    val stIno: ULong,
    val stNlink: UInt,
    val stDev: UInt,
    val stMode: UInt,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: UInt,
    val stAtime: Long,
    val stAtimeNsec: Long,
    val stMtime: Long,
    val stMtimeNsec: Long,
    val stCtime: Long,
    val stCtimeNsec: Long,
    val stSize: Long,
    val stBlocks: Long,
    val oldStBlksize: UInt,
    val stFlags: UInt,
    val stGen: UInt,
    val stLspare: Int,
    val stBlksize: Long,
    val stQspare2: Long,
)
