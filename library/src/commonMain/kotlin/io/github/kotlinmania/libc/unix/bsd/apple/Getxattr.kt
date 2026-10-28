package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: Int): Long
