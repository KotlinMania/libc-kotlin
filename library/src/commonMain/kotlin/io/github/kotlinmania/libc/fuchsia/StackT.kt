package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: Int,
    val ssSize: ULong,
)
