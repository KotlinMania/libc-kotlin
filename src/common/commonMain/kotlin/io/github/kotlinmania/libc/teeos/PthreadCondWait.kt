package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): Int
