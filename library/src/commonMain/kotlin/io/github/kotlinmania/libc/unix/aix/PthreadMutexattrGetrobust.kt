package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexattrGetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robust: Int?): Int
