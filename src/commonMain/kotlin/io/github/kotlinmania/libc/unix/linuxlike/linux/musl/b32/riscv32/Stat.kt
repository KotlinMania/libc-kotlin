// port-lint: source unix/linux_like/linux/musl/b32/riscv32/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.riscv32

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: ULong,
    val stIno: ULong,
    val stMode: UInt,
    val stNlink: ULong,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val pad1: ULong,
    val stSize: Long,
    val stBlksize: Long,
    val pad2: Int,
    val stBlocks: Long,
    val stAtime: Long,
    val stAtimeNsec: Long,
    val stMtime: Long,
    val stMtimeNsec: Long,
    val stCtime: Long,
    val stCtimeNsec: Long,
)
