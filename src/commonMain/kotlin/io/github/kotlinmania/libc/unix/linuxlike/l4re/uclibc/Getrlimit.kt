package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*

public expect fun getrlimit(resource: Int, rlim: Rlimit?): Int
