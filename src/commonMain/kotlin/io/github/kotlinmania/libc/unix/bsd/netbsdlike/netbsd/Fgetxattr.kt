package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun fgetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong): Long
