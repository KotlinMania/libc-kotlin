package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun shmCreateLargepage(path: String?, flags: Int, psind: Int, allocPolicy: Int, mode: UInt): Int
