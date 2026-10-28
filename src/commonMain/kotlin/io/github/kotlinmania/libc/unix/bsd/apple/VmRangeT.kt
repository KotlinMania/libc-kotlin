package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class VmRangeT(
    val address: ULong,
    val size: ULong,
)
