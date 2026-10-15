package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: UInt,
    val stIno: UShort,
    val stMode: UShort,
    val stNlink: Short,
    val stUid: Short,
    val stGid: Short,
    val stRdev: UInt,
    val stSize: Long,
    val stAtime: Long,
    val stMtime: Long,
    val stCtime: Long,
)
