// port-lint: source unix/linux_like/linux/gnu/b32/x86/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import io.github.kotlinmania.libc.*

public data class Stat64(
    val stDev: ULong,
    val stIno: ULong,
    val stIno2: ULong,
    val stMode: UInt,
    val stNlink: ULong,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stSize: Long,
    val stBlksize: Long,
    val stBlocks: Long,
    val stAtime: Long,
    val stAtimeNsec: Long,
    val stMtime: Long,
    val stMtimeNsec: Long,
    val stCtime: Long,
    val stCtimeNsec: Long,
    val stIno3: ULong,
)
