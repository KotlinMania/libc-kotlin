package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class Flock64(
    val lType: Short,
    val lWhence: Short,
    val lSysid: UInt,
    val lPid: Int,
    val lVfs: Int,
    val lStart: Long,
    val lLen: Long,
)
