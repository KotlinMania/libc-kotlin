package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun lseek64(fd: Int, offset: Long, whence: Int): Long
