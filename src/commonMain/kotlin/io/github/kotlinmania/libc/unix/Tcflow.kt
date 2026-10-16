package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun tcflow(fd: Int, action: Int): Int
