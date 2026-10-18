package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun fsetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: Int): Int
