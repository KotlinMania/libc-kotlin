package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Int
