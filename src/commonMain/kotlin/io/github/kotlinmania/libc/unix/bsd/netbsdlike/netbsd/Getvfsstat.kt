package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun getvfsstat(buf: Statvfs?, bufsize: ULong, flags: Int): Int
