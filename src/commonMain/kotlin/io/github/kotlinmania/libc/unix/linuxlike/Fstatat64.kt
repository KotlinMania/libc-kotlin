package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun fstatat64(dirfd: Int, pathname: String?, buf: Stat64?, flags: Int): Int
