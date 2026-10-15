package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun schedRrGetInterval(pid: Int, t: Timespec?): Int
