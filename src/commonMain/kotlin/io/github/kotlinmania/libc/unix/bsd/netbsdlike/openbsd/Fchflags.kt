package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public expect fun fchflags(fd: Int, flags: UInt): Int
