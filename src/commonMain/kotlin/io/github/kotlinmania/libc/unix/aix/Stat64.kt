// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class Stat64(
    val stDev: ULong,
    val stIno: ULong,
    val stMode: UInt,
    val stNlink: Short,
    val stFlag: UShort,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stSsize: Int,
    val stAtim: StTimespec,
    val stMtim: StTimespec,
    val stCtim: StTimespec,
    val stBlksize: Long,
    val stBlocks: Long,
    val stVfstype: Int,
    val stVfs: UInt,
    val stType: UInt,
    val stGen: UInt,
    val stSize: Long,
)
