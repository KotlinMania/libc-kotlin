package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Fdescenttbl(
    val fdtNfiles: Int,
    val fdtOfiles: LongArray,
)
