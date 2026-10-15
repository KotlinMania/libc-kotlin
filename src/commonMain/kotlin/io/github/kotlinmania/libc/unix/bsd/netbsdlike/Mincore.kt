package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun mincore(addr: COpaquePointer?, len: ULong, vec: String?): Int
