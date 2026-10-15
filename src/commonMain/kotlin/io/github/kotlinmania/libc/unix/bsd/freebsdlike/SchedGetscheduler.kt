package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun schedGetscheduler(pid: Int): Int
