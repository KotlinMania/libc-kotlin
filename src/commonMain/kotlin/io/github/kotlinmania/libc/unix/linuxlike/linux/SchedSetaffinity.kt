package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun schedSetaffinity(pid: Int, cpusetsize: ULong, cpuset: ULong?): Int
