package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun pthreadSpinInit(lock: Int?, pshared: Int): Int
