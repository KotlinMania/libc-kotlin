package io.github.kotlinmania.libc.unix.bsd
import io.github.kotlinmania.libc.unix.Rlimit

import io.github.kotlinmania.libc.*

public expect fun getrlimit(resource: Int, rlim: Rlimit?): Int
