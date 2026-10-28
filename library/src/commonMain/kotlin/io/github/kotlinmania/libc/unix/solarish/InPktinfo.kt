package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class InPktinfo(
    val ipiIfindex: UInt,
    val ipiSpecDst: InAddr,
    val ipiAddr: InAddr,
)
