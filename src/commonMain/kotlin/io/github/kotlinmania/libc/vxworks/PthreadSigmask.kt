package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadSigmask(how: Int, set: ULong?, oset: ULong?): Int
