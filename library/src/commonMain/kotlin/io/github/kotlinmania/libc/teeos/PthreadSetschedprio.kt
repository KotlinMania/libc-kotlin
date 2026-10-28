package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun pthreadSetschedprio(native: ULong, priority: Int): Int
