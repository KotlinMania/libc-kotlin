// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class Stat(
    val stIno: ULong,
    val stSize: Long,
    val stDev: UInt,
    val stRdev: UInt,
    val stUid: UInt,
    val stGid: UInt,
    val oldStMtime: UInt,
    val oldStAtime: UInt,
    val oldStCtime: UInt,
    val stMode: UInt,
    val stNlink: UInt,
    val stBlocksize: UInt,
    val stNblocks: Int,
    val stBlksize: UInt,
    val stBlocks: ULong,
    val stMtim: Timespec,
    val stAtim: Timespec,
    val stCtim: Timespec,
)
