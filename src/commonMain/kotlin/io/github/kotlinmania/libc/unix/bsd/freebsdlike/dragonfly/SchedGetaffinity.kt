package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public expect fun schedGetaffinity(pid: Int, cpusetsize: ULong, mask: io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly.CpumaskT?): Int
