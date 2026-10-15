// port-lint: source unix/linux_like/linux/gnu/b32/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: ULong,
    val stIno: ULong,
    val stIno2: ULong,
    val stMode: UInt,
    val stNlink: UInt,
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
