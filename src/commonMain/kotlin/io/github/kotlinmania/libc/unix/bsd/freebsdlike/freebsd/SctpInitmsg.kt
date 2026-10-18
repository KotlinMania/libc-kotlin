package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpInitmsg(
    val sinitNumOstreams: UShort,
    val sinitMaxInstreams: UShort,
    val sinitMaxAttempts: UShort,
    val sinitMaxInitTimeo: UShort,
)
