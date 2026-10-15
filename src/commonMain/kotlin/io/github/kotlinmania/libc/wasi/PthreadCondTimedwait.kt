package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): Int
