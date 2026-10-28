package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun wmemchr(cx: UInt?, c: UInt, n: ULong): UInt?
