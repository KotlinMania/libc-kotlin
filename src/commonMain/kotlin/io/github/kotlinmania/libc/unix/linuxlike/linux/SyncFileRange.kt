package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun syncFileRange(fd: Int, offset: Long, nbytes: Long, flags: UInt): Int
