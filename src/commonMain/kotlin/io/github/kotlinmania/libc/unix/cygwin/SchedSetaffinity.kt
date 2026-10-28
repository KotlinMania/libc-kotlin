package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun schedSetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int
