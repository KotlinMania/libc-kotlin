package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun dup2(src: Int, dst: Int): Int
