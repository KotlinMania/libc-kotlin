package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun sendfile(fd: Int, s: Int, offset: Long, nbytes: ULong, hdtr: SfHdtr?, sbytes: Long?, flags: Int): Int
