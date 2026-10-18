package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: Int): Int
