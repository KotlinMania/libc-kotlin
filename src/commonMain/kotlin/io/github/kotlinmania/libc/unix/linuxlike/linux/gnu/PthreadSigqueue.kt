package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu
import io.github.kotlinmania.libc.unix.Sigval

import io.github.kotlinmania.libc.*

public expect fun pthreadSigqueue(thread: ULong, sig: Int, value: Sigval): Int
