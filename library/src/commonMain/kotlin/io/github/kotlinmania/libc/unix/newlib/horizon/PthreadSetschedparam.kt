package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*

public expect fun pthreadSetschedparam(native: ULong, policy: Int, param: SchedParam?): Int
