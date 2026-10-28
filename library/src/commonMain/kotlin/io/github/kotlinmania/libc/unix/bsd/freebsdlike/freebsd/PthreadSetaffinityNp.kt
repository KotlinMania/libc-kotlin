package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun pthreadSetaffinityNp(td: ULong, cpusetsize: ULong, cpusetp: CpusetT?): Int
