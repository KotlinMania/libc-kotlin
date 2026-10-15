// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Stat(
    val stFstype: Int,
    val stDev: ULong,
    val stIno: ULong,
    val stGen: UInt,
    val stRdev: UInt,
    val stMode: UInt,
    val stNlink: UInt,
    val stUid: UInt,
    val stGid: UInt,
    val stSize: Long,
    val stAtim: Timespec,
    val stMtim: Timespec,
    val stCtim: Timespec,
    val stBlksize: Long,
    val stBlocks: Long,
    val stAuthor: UInt,
    val stFlags: UInt,
    val stSpare: IntArray,
)
