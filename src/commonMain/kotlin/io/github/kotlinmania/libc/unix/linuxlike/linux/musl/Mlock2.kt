package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*

public expect fun mlock2(addr: COpaquePointer?, len: ULong, flags: UInt): Int
