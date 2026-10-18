package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timeval

public data class Splice(
    val spFd: Int,
    val spMax: Long,
    val spIdle: Timeval,
)
