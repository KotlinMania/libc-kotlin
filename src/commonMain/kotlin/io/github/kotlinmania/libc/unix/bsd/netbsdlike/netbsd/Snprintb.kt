package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun snprintb(buf: String?, buflen: ULong, fmt: String?, `val`: ULong): Int
