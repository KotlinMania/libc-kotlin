package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saSigaction: ULong,
    val saMask: ULong,
    val saFlags: Int,
)
