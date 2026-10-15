// port-lint: source unix/linux_like/l4re/uclibc/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.x8664

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: ULong,
    val stIno: ULong,
    val stNlink: ULong,
    val stMode: UInt,
    val stUid: UInt,
    val stGid: UInt,
    val pad0: Int,
    val stRdev: ULong,
    val stSize: Long,
    val stBlksize: Long,
    val stBlocks: Long,
    val stAtim: Timespec,
    val stMtim: Timespec,
    val stCtim: Timespec,
    val uclibcUnused: LongArray,
)
