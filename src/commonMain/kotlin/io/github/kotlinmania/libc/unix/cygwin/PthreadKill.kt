package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun pthreadKill(thread: io.github.kotlinmania.libc.COpaquePointer?, sig: Int): Int
