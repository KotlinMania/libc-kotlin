package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun pthreadSpinInit(lock: ULong?, pshared: Int): Int
