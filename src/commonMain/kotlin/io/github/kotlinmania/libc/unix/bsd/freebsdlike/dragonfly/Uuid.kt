package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class Uuid(
    val timeLow: UInt,
    val timeMid: UShort,
    val timeHiAndVersion: UShort,
    val clockSeqLow: UByte,
    val node: UByteArray,
)
