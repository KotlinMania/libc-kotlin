package io.github.kotlinmania.libc.unix.linuxlike.android
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam

public expect fun schedSetparam(pid: Int, param: SchedParam?): Int
