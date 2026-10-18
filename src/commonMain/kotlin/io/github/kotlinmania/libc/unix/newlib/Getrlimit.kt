package io.github.kotlinmania.libc.unix.newlib
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Rlimit

public expect fun getrlimit(resource: Int, rlim: Rlimit?): Int
