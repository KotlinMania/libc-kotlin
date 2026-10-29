package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public expect fun pthreadGetNameNp(tid: ULong, name: String?, len: ULong)
