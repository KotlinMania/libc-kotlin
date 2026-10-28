package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class CpuSetT(
    val bits: List<ULong>,
    val bits2: List<ULong>,
)
