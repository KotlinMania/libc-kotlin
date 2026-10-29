package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun pwritev(fd: Int, iovec: Iovec?, count: Int, offset: Long): Int
