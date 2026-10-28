package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun mknodat(dirfd: Int, pathname: String?, mode: UInt, dev: ULong): Int
