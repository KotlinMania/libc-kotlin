package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun listxattr(path: String?, list: String?, size: ULong, flags: Int): Long
