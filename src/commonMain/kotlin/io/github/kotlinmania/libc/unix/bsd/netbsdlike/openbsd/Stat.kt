// port-lint: source unix/bsd/netbsdlike/openbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class Stat(
    val stMode: UInt,
    val stDev: Int,
    val stIno: ULong,
    val stNlink: ULong,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: Int,
    val stAtime: Long,
    val stAtimeNsec: Long,
    val stMtime: Long,
    val stMtimeNsec: Long,
    val stCtime: Long,
    val stCtimeNsec: Long,
    val stSize: Long,
    val stBlocks: Long,
    val stBlksize: Int,
    val stFlags: UInt,
    val stGen: UInt,
    val stBirthtime: Long,
    val stBirthtimeNsec: Long,
)
