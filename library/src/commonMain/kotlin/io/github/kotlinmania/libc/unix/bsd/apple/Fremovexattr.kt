package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun fremovexattr(filedes: Int, name: String?, flags: Int): Int
