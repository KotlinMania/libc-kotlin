package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrGetNp(tid: ULong, attr: io.github.kotlinmania.libc.COpaquePointer?): Int
