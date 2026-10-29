package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.x8664

import io.github.kotlinmania.libc.*

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: Int,
    val ssSize: ULong,
)
