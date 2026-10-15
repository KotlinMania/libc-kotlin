package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun pthreadSpinInit(lock: Int?, pshared: Int): Int
