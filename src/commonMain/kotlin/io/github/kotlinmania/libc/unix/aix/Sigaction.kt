package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saSigaction: ULong,
    val saMask: SigsetT,
    val saFlags: Int,
)
