package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saHandler: io.github.kotlinmania.libc.SignalHandler?,
    val saMask: SigsetT,
    val saFlags: Int,
)
