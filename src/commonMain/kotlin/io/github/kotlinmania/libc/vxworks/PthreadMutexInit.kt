package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): Int
