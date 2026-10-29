package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public expect fun mlock2(addr: COpaquePointer?, len: ULong, flags: UInt): Int
