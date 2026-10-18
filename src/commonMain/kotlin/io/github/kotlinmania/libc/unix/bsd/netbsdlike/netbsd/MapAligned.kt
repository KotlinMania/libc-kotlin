package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public fun mapAligned(alignment: Int): Int = alignment shl MAP_ALIGNMENT_SHIFT
