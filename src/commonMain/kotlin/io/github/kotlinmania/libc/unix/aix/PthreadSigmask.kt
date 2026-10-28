package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun pthreadSigmask(how: Int, set: SigsetT?, oset: SigsetT?): Int
