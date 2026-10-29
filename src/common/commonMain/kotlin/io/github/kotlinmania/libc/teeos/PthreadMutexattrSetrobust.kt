package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: Int): Int
