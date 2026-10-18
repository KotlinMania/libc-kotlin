package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun memsetS(s: COpaquePointer?, smax: ULong, c: Int, n: ULong): Int
