package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public expect fun pthreadSigqueue(thread: ULong, sig: Int, value: Sigval): Int
