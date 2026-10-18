package io.github.kotlinmania.libc.unix.bsd.apple.b32

import io.github.kotlinmania.libc.*

public actual fun exchangedata(path1: String?, path2: String?, options: ULong): Int =
    throw UnsupportedOperationException("exchangedata not available on JVM — no C library access")
