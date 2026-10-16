package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun getrlimit(resource: Int, rlim: Rlimit?): Int
