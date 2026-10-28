package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.arm

import io.github.kotlinmania.libc.*

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: Int,
    val ssSize: ULong,
)
