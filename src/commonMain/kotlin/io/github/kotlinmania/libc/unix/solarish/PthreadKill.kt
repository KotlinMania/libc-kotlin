package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun pthreadKill(thread: UInt, sig: Int): Int
