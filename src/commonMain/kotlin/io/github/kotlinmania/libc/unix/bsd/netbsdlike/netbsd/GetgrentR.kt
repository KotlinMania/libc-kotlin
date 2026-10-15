package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int
