package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int
