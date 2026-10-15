package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun mknodat(dirfd: Int, pathname: String?, mode: UInt, dev: UInt): Int
