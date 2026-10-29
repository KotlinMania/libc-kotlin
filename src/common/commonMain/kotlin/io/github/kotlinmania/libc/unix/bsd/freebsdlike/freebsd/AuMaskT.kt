package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class AuMaskT(
    val amSuccess: UInt,
    val amFailure: UInt,
)
