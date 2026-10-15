// port-lint: source unix/bsd/freebsdlike/freebsd/freebsd11/b32.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: UInt,
    val stIno: UInt,
    val stMode: UInt,
    val stNlink: UShort,
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
    val stBlksize: Long,
    val stFlags: UInt,
    val stGen: UInt,
    val stLspare: Int,
    val stBirthtime: Long,
    val stBirthtimeNsec: Long,
)
