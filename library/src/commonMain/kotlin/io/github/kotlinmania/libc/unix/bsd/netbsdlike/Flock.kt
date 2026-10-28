package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public data class Flock(
    val lStart: Long,
    val lLen: Long,
    val lPid: Int,
    val lType: Short,
    val lWhence: Short,
)
