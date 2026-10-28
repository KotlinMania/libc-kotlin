package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun schedSetparam(pid: Int, param: SchedParam?): Int
