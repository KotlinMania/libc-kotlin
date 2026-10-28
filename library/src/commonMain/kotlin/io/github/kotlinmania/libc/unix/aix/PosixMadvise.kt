package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int
