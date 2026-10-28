package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpErrorNoUserData(
    val cause: SctpErrorCause,
    val tsn: UInt,
)
