package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun cpuIsSet(cpu: ULong, cpuset: CpuSetT?): Boolean
