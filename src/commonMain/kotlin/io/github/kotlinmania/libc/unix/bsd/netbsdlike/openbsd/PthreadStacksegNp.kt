package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.StackT

public expect fun pthreadStacksegNp(thread: ULong, sinfo: StackT?): Int
