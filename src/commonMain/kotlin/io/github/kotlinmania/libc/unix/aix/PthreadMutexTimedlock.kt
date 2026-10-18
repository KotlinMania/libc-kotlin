package io.github.kotlinmania.libc.unix.aix
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexTimedlock(mutex: PthreadMutexT?, abstime: Timespec?): Int
