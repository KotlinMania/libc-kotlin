package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun ttyname(fd: Int): String?
