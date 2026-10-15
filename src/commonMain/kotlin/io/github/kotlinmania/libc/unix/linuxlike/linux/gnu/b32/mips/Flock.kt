package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.mips

import io.github.kotlinmania.libc.*

public data class Flock(
    val lType: Short,
    val lWhence: Short,
    val lStart: Long,
    val lLen: Long,
    val lSysid: Long,
    val lPid: Int,
)
