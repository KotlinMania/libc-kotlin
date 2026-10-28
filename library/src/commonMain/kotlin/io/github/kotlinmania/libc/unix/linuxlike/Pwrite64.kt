package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun pwrite64(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long
