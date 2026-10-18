package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class InEndpoints(
    val ieFport: UShort,
    val ieLport: UShort,
    val ieDependfaddr: InDependaddr,
    val ieDependladdr: InDependaddr,
    val ie6Zoneid: UInt,
)
