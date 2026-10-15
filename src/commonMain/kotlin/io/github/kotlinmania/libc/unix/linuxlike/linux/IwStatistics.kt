package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class IwStatistics(
    val status: UShort,
    val qual: IwQuality,
    val discard: IwDiscarded,
    val miss: IwMissed,
)
