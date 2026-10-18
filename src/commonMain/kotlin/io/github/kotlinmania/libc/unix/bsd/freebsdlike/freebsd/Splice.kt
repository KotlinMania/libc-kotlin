package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.unix.Timeval

import io.github.kotlinmania.libc.*

public data class Splice(
    val spFd: Int,
    val spMax: Long,
    val spIdle: Timeval,
)
