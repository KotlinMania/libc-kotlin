package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun utrace(addr: COpaquePointer?, len: ULong): Int
