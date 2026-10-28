package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun pthreadRwlockRdlock(lock: PthreadRwlockT?): Int
