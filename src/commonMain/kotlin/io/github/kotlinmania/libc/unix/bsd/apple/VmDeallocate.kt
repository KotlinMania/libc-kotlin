package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun vmDeallocate(targetTask: UInt, address: ULong, size: ULong): Int
