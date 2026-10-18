package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc
import io.github.kotlinmania.libc.unix.Rlimit

import io.github.kotlinmania.libc.*

public expect fun setrlimit(resource: Int, rlim: Rlimit?): Int
