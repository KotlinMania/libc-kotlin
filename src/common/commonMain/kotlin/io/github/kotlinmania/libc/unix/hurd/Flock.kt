package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Flock(
    val lType: Int,
    val lWhence: Int,
    val lType2: Short,
    val lWhence2: Short,
    val lStart: Long,
    val lLen: Long,
    val lPid: Int,
)
