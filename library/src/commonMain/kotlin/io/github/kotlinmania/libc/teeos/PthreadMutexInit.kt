package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): Int
