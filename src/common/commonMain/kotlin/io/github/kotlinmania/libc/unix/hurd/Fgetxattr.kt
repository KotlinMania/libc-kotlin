package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun fgetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong): Int
