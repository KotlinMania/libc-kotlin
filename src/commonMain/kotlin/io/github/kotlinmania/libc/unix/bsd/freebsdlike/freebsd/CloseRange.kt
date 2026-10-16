package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun closeRange(lowfd: UInt, highfd: UInt, flags: Int): Int
