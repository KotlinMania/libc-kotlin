package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun pthreadSpinInit(lock: Int?, pshared: Int): Int
