package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: ULong,
    val stIno: ULong,
    val stNlink: ULong,
    val stMode: UInt,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stSize: Long,
    val stBlksize: Long,
    val stBlocks: Long,
    val stAtim: Timespec,
    val stMtim: Timespec,
    val stCtim: Timespec,
)
