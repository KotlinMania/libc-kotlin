package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public expect fun pthreadStacksegNp(thread: ULong, sinfo: StackT?): Int
