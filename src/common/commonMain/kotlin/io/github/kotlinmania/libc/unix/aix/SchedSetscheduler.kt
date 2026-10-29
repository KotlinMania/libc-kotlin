package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int
