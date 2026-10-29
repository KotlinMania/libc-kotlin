package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun pthreadBarrierInit(barrier: ULong?, attr: ULong?, count: UInt): Int
