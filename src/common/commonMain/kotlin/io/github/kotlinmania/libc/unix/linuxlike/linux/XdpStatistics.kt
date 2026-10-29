package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class XdpStatistics(
    val rxDropped: ULong,
    val rxInvalidDescs: ULong,
    val txInvalidDescs: ULong,
    val rxRingFull: ULong,
    val rxFillRingEmptyDescs: ULong,
    val txRingEmptyDescs: ULong,
)
