package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public fun isSecureMask(x: Int): Int = 1 shl x
