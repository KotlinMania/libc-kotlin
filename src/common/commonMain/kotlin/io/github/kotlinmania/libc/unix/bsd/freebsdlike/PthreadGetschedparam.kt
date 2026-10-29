package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun pthreadGetschedparam(native: ULong, policy: Int?, param: SchedParam?): Int
