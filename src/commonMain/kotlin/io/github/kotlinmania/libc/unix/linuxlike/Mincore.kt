package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun mincore(addr: COpaquePointer?, len: ULong, vec: COpaquePointer?): Int
