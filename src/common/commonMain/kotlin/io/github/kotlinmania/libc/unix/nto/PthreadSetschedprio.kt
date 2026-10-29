package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun pthreadSetschedprio(native: Int, priority: Int): Int
