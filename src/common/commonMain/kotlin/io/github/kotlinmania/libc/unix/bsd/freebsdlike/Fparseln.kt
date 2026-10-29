package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun fparseln(stream: FILE?, len: ULong?, lineno: ULong?, delim: String?, flags: Int): String?
