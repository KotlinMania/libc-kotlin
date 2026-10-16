package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun getrlimit(resource: UInt, rlim: Rlimit?): Int
