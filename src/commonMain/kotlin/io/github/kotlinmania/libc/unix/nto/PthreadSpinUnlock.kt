package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun pthreadSpinUnlock(lock: io.github.kotlinmania.libc.unix.nto.SyncT?): Int
