package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc
import io.github.kotlinmania.libc.unix.Rlimit

import io.github.kotlinmania.libc.*

public expect fun getrlimit(resource: ULong, rlim: Rlimit?): Int
