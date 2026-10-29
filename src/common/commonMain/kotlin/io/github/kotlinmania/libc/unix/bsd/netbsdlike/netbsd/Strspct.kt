package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun strspct(buf: String?, bufsiz: ULong, numerator: Long, denominator: Long, precision: ULong): String?
