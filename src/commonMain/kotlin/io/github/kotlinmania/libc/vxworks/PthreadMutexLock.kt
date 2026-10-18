package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexLock(mutex: PthreadMutexT?): Int
