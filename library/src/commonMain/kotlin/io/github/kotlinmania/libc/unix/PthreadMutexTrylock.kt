package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexTrylock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int
