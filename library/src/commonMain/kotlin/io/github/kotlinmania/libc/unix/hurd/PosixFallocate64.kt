package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun posixFallocate64(fd: Int, offset: Long, len: Long): Int
