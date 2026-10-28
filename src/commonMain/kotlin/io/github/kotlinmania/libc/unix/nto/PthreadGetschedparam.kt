package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun pthreadGetschedparam(native: Int, policy: Int?, param: SchedParam?): Int
