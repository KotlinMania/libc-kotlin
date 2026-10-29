package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun ptsname(fd: Int): String?
