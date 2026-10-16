package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpSndAllCompletes(
    val sallStream: UShort,
    val sallFlags: UShort,
    val sallPpid: UInt,
    val sallContext: UInt,
    val sallNumSent: UInt,
    val sallNumFailed: UInt,
)
