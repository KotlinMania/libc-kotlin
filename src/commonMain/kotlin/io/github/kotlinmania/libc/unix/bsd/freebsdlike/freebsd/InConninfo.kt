package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class InConninfo(
    val incFlags: UByte,
    val incLen: UByte,
    val incFibnum: UShort,
    val incIe: InEndpoints,
)
