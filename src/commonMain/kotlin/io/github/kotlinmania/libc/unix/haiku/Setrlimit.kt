package io.github.kotlinmania.libc.unix.haiku
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Rlimit

public expect fun setrlimit(resource: Int, rlim: Rlimit?): Int
