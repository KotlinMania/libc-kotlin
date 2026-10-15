package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun fremovexattr(filedes: Int, name: String?): Int
