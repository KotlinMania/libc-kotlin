package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun ioctl(fildes: Int, request: Int, vararg args: Any?): Int
