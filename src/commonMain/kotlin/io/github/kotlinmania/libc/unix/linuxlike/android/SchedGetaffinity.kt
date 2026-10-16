package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun schedGetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int
