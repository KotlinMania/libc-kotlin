package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public expect fun pthreadSigmask(how: Int, set: SigsetT?, oldset: SigsetT?): Int
