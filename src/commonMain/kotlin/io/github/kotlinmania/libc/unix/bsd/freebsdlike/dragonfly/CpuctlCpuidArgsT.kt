package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class CpuctlCpuidArgsT(
    val level: Int,
    val data: UIntArray,
)
