package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssSize: ULong,
    val ssFlags: Int,
    val pad: IntArray,
)
