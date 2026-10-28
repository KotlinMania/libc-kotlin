package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun pipe2(fds: Int?, flags: Int): Int
