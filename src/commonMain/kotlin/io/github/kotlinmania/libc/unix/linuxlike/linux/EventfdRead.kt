package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun eventfdRead(fd: Int, value: ULong?): Int
