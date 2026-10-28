package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.sparc64

import io.github.kotlinmania.libc.*

public data class Flock64(
    val lType: Short,
    val lWhence: Short,
    val lStart: Long,
    val lLen: Long,
    val lPid: Int,
)
