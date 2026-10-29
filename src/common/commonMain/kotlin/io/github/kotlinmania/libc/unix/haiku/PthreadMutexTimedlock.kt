package io.github.kotlinmania.libc.unix.haiku
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): Int
