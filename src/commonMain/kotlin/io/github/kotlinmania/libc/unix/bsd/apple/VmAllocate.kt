package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun vmAllocate(targetTask: UInt, address: ULong?, size: ULong, flags: Int): Int
