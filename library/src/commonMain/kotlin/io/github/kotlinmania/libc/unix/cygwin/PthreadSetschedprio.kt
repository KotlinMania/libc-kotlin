package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun pthreadSetschedprio(native: io.github.kotlinmania.libc.COpaquePointer?, priority: Int): Int
