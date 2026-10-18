package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): Int
