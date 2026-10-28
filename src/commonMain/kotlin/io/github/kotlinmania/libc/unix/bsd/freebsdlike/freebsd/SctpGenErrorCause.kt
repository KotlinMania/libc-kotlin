package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpGenErrorCause(
    val code: UShort,
    val length: UShort,
    val info: UByteArray,
)
