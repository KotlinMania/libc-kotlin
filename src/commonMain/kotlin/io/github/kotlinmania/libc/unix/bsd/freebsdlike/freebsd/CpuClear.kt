package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun cpuClear(cpu: ULong, cpuset: CpusetT?)
