package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun pthreadSigmask(how: Int, newmask: ULong?, oldmask: ULong?): Int
