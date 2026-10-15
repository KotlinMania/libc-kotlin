package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public expect fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int
