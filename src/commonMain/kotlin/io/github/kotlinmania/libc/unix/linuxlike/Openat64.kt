package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun openat64(fd: Int, path: String?, oflag: Int, vararg args: Any?): Int
