package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public expect fun posixFallocate(fd: Int, offset: Long, len: Long): Int
