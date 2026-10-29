package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun pthreadSpinInit(lock: io.github.kotlinmania.libc.unix.nto.SyncT?, pshared: Int): Int
