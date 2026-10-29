package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun schedGetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int
