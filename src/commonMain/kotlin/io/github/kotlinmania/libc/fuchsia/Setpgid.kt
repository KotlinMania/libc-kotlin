package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun setpgid(pid: Int, pgid: Int): Int
