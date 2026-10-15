package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public expect fun pthreadKill(thread: ULong, sig: Int): Int
