package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun schedGetparam(pid: Int, param: SchedParam?): Int
