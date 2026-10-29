package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Pidfh(
    val priva: List<ULongArray>,
    val privb: List<ULong>,
)
