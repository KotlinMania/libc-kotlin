package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun cpuSet(cpu: ULong, cpuset: CpuSetT?)
