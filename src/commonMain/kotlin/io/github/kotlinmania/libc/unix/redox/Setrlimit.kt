package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun setrlimit(resource: Int, rlim: Rlimit?): Int
