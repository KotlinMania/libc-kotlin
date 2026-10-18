package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun ttyname(fd: Int): String?
