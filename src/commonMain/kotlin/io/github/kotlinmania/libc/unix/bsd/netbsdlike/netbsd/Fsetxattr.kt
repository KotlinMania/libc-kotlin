package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun fsetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int
