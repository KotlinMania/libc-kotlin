package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun mkfifoat(dirfd: Int, pathname: String?, mode: UInt): Int
