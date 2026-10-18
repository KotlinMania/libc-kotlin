package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.SchedParam

public expect fun schedSetparam(pid: Int, param: SchedParam?): Int
