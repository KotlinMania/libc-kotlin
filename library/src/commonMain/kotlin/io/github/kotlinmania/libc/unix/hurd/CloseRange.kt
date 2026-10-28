package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun closeRange(first: UInt, last: UInt, flags: Int): Int
