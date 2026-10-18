package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.SchedParam

import io.github.kotlinmania.libc.*

public expect fun schedSetparam(pid: Int, param: SchedParam?): Int
