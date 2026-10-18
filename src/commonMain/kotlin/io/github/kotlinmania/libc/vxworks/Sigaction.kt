package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saU: SaUT,
    val saSigaction: ULong,
    val saMask: ULong,
    val saFlags: Int,
)
