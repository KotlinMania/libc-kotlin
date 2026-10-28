package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun tcsendbreak(fd: Int, duration: Int): Int
