package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun ioctl(fd: Int, request: ULong, vararg args: Any?): Int
