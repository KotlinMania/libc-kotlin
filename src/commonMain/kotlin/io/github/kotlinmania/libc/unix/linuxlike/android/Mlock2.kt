package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun mlock2(addr: COpaquePointer?, len: ULong, flags: Int): Int
