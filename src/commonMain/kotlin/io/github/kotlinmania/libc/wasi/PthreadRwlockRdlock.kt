package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun pthreadRwlockRdlock(lock: PthreadRwlockT?): Int
