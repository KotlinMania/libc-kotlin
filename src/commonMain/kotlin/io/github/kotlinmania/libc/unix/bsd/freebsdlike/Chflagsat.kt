package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun chflagsat(fd: Int, path: String?, flags: ULong, atflag: Int): Int
