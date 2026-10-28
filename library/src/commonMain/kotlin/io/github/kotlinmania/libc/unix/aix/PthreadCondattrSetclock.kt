package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Long): Int
