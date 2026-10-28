package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun cpusetSet(cpu: ULong, set: ULong?): Int
