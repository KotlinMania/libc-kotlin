package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class CpuctlUpdateArgsT(
    val data: COpaquePointer?,
    val size: ULong,
)
