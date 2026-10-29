package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun flistxattr(filedes: Int, list: String?, size: ULong): Int
