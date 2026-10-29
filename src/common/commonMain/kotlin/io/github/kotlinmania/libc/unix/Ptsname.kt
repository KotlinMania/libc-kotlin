package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun ptsname(fd: Int): String?
