package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexattrGetrobust(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?, robustness: Int?): Int
