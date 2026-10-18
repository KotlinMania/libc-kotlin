package io.github.kotlinmania.libc.unix.solarish
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timeval

public data class Ntptimeval(
    val time: Timeval,
    val maxerror: Int,
    val esterror: Int,
)
