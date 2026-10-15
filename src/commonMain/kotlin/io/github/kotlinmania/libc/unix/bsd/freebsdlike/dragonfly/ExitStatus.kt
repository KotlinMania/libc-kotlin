package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class ExitStatus(
    val eTermination: UShort,
    val eExit: UShort,
)
