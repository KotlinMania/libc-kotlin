package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun cpuClear(cpu: ULong, cpuset: CpuSetT?)
