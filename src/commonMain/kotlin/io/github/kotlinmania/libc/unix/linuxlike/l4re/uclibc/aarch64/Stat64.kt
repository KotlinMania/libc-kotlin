package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.aarch64

import io.github.kotlinmania.libc.*

public data class Stat64(
    val stDev: ULong,
    val pad1: UInt,
    val stIno: ULong,
    val stMode: UInt,
    val stNlink: ULong,
    val stUid: UInt,
    val stGid: UInt,
    val stRdev: ULong,
    val pad2: UInt,
    val stSize: Long,
    val stBlksize: Long,
    val stBlocks: Long,
    val stAtim: Timespec,
    val stMtim: Timespec,
    val stCtim: Timespec,
    val stIno2: ULong,
)
