package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public expect fun setrlimit(resource: Int, rlim: Rlimit?): Int
