package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun flistxattr(filedes: Int, list: String?, size: ULong): Long
