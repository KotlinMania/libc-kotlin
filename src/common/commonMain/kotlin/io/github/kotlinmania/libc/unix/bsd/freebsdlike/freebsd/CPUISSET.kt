package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun cpuIsSet(cpu: ULong, cpuset: CpusetT?): Boolean
