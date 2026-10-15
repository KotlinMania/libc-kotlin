package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun dup3(src: Int, dst: Int, flags: Int): Int
