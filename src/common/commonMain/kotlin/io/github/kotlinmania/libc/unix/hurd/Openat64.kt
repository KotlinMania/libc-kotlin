package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun openat64(fd: Int, file: String?, oflag: Int, vararg args: Any?): Int
