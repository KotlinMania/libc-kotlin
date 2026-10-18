package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.SchedParam

public expect fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int
