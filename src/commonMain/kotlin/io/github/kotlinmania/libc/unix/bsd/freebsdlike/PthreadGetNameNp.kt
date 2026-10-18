package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun pthreadGetNameNp(tid: ULong, name: String?, len: ULong)
