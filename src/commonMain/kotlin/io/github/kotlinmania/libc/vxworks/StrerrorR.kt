package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int
