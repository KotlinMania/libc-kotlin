package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Rlimit

public expect fun setrlimit(resource: ULong, rlim: Rlimit?): Int
