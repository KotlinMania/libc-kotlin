package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun pthreadSigmask(how: Int, set: ULong?, oldset: ULong?): Int
