package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun machVmMap(targetTask: UInt, address: ULong?, size: ULong, mask: ULong, flags: Int, `object`: UInt, offset: ULong, copy: Int, curProtection: Int, maxProtection: Int, inheritance: UInt): Int
