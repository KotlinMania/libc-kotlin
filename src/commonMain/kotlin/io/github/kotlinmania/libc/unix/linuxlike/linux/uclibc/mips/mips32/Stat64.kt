// port-lint: source unix/linux_like/linux/uclibc/mips/mips32/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*

public data class Stat64(
    val stDev: ULong,
    val stIno: ULong,
    val stMode: UInt,
    val stNlink: UInt,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stSize: Long,
    val stAtime: Int,
    val stAtimeNsec: Long,
    val stMtime: Int,
    val stMtimeNsec: Long,
    val stCtime: Int,
    val stCtimeNsec: Long,
    val stBlksize: Int,
    val stBlocks: Long,
)
