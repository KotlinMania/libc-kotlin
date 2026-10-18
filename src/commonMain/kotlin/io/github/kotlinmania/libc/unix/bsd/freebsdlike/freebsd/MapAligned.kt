package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public fun mapAligned(a: Int): Int = a shl MAP_ALIGNMENT_SHIFT
