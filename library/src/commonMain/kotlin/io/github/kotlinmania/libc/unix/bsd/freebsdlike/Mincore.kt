package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun mincore(addr: COpaquePointer?, len: ULong, vec: String?): Int
