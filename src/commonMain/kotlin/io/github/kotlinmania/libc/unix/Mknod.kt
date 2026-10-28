package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun mknod(pathname: String?, mode: UInt, dev: ULong): Int
