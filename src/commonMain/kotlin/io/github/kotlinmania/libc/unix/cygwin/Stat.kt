package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: UInt,
    val stIno: ULong,
    val stMode: UInt,
    val stNlink: UShort,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: UInt,
    val stSize: Long,
    val stAtime: Long,
    val stAtimeNsec: Long,
    val stMtime: Long,
    val stMtimeNsec: Long,
    val stCtime: Long,
    val stCtimeNsec: Long,
    val stBlksize: Int,
    val stBlocks: Long,
    val stBirthtime: Long,
    val stBirthtimeNsec: Long,
)
