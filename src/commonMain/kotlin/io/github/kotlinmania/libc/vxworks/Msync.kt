package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int
