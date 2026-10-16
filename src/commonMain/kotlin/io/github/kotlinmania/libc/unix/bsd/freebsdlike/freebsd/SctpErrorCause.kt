package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpErrorCause(
    val code: UShort,
    val length: UShort,
)
