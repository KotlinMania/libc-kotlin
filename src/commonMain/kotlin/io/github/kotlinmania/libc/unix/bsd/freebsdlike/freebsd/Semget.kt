package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun semget(key: Int, nsems: Int, semflg: Int): Int
