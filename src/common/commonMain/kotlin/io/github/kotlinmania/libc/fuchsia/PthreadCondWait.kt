package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): Int
