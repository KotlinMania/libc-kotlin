package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun dup3(oldfd: Int, newfd: Int, flags: Int): Int
