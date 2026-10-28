package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): Int
