package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun schedSetparam(pid: Int, param: SchedParam?): Int
