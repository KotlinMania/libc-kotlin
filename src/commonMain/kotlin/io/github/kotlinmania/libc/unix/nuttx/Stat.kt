package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: Int,
    val stIno: UShort,
    val stMode: UInt,
    val stNlink: UShort,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: Int,
    val stSize: Long,
    val stAtim: Timespec,
    val stMtim: Timespec,
    val stCtim: Timespec,
    val stBlksize: Short,
    val stBlocks: Long,
)
