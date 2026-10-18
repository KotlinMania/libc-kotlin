package io.github.kotlinmania.libc.unix.nto
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun pthreadMutexTimedlock(lock: io.github.kotlinmania.libc.unix.nto.SyncT?, abstime: Timespec?): Int
