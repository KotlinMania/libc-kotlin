package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun eui64Ntohost(hostname: String?, len: ULong, id: Eui64?): Int
