package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int
