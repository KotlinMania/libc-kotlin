package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*

public expect fun setrlimit64(resource: ULong, rlim: Rlimit64?): Int
