package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadGetschedparam(native: ULong, policy: Int?, param: SchedParam?): Int
