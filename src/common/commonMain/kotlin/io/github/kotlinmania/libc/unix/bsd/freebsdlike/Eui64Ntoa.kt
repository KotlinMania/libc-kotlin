package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun eui64Ntoa(id: Eui64?, a: String?, len: ULong): Int
