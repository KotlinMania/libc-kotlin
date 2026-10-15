package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun schedGetparam(pid: Int, param: SchedParam?): Int
