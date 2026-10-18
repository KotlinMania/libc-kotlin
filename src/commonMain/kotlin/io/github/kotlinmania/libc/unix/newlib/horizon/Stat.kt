package io.github.kotlinmania.libc.unix.newlib.horizon
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public data class Stat(
    val stDev: ULong,
    val stIno: ULong,
    val stMode: UInt,
    val stNlink: ULong,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val stSize: Long,
    val stAtim: Timespec,
    val stMtim: Timespec,
    val stCtim: Timespec,
    val stBlksize: Long,
    val stBlocks: Long,
    val stSpare4: LongArray,
)
