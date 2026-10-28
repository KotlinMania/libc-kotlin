package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun cpuSet(cpu: ULong, cpuset: CpuSetT?)
