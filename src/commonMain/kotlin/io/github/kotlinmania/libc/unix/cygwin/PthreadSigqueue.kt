package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public expect fun pthreadSigqueue(thread: io.github.kotlinmania.libc.COpaquePointer?, sig: Int, value: Sigval): Int
