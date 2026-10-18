package io.github.kotlinmania.libc.unix.linuxlike.android
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam

import io.github.kotlinmania.libc.*

public expect fun schedSetparam(pid: Int, param: SchedParam?): Int
