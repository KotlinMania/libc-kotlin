package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun realhostname(host: String?, hsize: ULong, ip: InAddr?): Int
