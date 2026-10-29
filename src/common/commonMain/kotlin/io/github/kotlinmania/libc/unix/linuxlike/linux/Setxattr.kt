package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int
