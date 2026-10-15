package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun semget(key: Int, nsems: Int, semflg: Int): Int
