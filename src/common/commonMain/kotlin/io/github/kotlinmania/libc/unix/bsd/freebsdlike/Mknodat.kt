package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun mknodat(dirfd: Int, pathname: String?, mode: UShort, dev: ULong): Int
