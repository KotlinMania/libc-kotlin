// port-lint: source unix/linux_like/linux/musl/b32/arm/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.arm

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: ULong,
    val stInoTruncated: Long,
    val stMode: UInt,
    val stNlink: ULong,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stSize: Long,
    val stBlksize: Long,
    val stBlocks: Long,
    val stIno: ULong,
    val stAtime: Long,
    val stAtimeNsec: Long,
    val stMtime: Long,
    val stMtimeNsec: Long,
    val stCtime: Long,
    val stCtimeNsec: Long,
    val stIno2: ULong,
)
