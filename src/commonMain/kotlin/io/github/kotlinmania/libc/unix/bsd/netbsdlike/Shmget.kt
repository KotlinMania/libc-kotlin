package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun shmget(key: Long, size: ULong, shmflg: Int): Int
