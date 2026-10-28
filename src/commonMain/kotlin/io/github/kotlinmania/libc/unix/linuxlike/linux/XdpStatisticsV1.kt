package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class XdpStatisticsV1(
    val rxDropped: ULong,
    val rxInvalidDescs: ULong,
    val txInvalidDescs: ULong,
)
