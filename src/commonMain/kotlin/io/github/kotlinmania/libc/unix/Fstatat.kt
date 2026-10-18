package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.unix.bsd.apple.Stat

import io.github.kotlinmania.libc.*

public expect fun fstatat(dirfd: Int, pathname: String?, buf: Stat?, flags: Int): Int
