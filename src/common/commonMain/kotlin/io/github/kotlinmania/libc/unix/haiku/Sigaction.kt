package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saSigaction: ULong,
    val saMask: ULong,
    val saFlags: Int,
    val saUserdata: COpaquePointer?,
)
