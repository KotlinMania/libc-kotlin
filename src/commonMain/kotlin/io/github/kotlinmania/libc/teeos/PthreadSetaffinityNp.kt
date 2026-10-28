package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun pthreadSetaffinityNp(td: ULong, size: ULong, set: CpuSetT?): Int
