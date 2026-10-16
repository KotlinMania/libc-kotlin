package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun ptsnameR(fd: Int, buf: String?, buflen: ULong): Int
