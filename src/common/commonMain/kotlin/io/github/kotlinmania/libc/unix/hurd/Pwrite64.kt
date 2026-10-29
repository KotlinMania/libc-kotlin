package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun pwrite64(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Int
