package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun ttynameR(fd: Int, buf: String?, buflen: ULong): Int
