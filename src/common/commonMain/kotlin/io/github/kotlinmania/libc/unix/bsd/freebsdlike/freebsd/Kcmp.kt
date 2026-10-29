package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun kcmp(pid1: Int, pid2: Int, type: Int, idx1: ULong, idx2: ULong): Int
