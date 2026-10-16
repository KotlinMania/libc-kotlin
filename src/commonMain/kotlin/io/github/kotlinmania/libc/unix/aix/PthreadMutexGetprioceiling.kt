package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexGetprioceiling(mutex: PthreadMutexT?, prioceiling: Int?): Int
