package io.github.kotlinmania.libc.unix.bsd.apple
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public data class Ntptimeval(
    val time: Timespec,
    val maxerror: Long,
    val esterror: Long,
    val tai: Long,
    val timeState: Int,
)
