package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class CpuctlCpuidCountArgsT(
    val level: Int,
    val levelType: Int,
    val data: UIntArray,
)
