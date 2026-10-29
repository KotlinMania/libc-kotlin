package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun ioctl(fildes: Int, request: Int, vararg args: Any?): Int
