package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Shmstat(
    val size: ULong,
    val mode: UShort,
)
