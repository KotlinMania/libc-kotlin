package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun cpuCountS(size: ULong, cpuset: CpuSetT?): Int
