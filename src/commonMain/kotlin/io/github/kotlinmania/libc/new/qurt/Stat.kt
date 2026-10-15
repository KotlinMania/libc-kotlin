package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public data class Stat(
    val stDev: ULong,
    val stIno: ULong,
    val stMode: UInt,
    val stNlink: UInt,
    val stRdev: ULong,
    val stSize: Long,
    val stAtime: Long,
    val stMtime: Long,
    val stCtime: Long,
)
