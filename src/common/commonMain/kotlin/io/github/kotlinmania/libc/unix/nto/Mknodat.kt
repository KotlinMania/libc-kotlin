package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun mknodat(fd: Int, pathname: String?, mode: UInt, dev: UInt): Int
