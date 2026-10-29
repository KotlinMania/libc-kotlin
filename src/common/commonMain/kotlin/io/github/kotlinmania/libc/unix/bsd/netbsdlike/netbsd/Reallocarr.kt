package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun reallocarr(ptr: COpaquePointer?, number: ULong, size: ULong): Int
