package io.github.kotlinmania.libc.unix.linuxlike.linux.musl
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timeval

public data class Ntptimeval(
    val time: Timeval,
    val maxerror: Long,
    val esterror: Long,
)
