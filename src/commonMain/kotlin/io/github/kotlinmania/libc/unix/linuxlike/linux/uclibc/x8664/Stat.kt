// port-lint: source unix/linux_like/linux/uclibc/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: ULong,
    val stIno: ULong,
    val stNlink: UInt,
    val stMode: UInt,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stSize: Long,
    val stBlksize: Long,
    val stBlocks: Long,
    val stAtime: Int,
    val stAtimeNsec: ULong,
    val stMtime: Int,
    val stMtimeNsec: ULong,
    val stCtime: Int,
    val stCtimeNsec: ULong,
)
