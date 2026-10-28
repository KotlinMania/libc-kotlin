package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun kill(pid: Int, sig: Int): Int
