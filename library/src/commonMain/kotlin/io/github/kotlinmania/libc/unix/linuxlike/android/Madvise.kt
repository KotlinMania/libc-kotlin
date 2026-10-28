package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int
