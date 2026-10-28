package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun pthreadGetschedparam(thread: UInt, policy: Int?, param: SchedParam?): Int
