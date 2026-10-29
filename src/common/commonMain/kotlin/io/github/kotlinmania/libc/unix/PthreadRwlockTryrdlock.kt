package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun pthreadRwlockTryrdlock(lock: io.github.kotlinmania.libc.COpaquePointer?): Int
