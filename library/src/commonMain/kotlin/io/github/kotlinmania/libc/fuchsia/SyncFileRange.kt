package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun syncFileRange(fd: Int, offset: Long, nbytes: Long, flags: UInt): Int
