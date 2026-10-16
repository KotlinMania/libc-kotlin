package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun pthreadGetschedparam(native: ULong, policy: Int?, param: SchedParam?): Int
