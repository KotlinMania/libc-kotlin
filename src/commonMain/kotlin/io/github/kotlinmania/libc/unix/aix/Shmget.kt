package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun shmget(key: Int, size: ULong, shmflg: Int): Int
