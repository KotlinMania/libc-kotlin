package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public data class Ntptimeval(
    val time: Timespec,
    val maxerror: Long,
    val esterror: Long,
    val tai: Long,
    val timeState: Int,
)
