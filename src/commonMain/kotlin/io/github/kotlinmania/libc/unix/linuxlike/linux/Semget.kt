package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun semget(key: Int, nsems: Int, semflag: Int): Int
