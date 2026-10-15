package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public expect fun syscall(num: Int, vararg args: Any?): Int
