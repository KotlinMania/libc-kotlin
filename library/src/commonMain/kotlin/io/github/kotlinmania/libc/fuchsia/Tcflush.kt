package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun tcflush(fd: Int, action: Int): Int
