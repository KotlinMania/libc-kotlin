package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class InPktinfo(
    val ipiAddr: InAddr,
    val ipiIfindex: UInt,
)
