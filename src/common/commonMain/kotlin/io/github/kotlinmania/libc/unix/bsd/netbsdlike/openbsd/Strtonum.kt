package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public expect fun strtonum(nptr: String?, minval: Long, maxval: Long, errstr: COpaquePointer?): Long
