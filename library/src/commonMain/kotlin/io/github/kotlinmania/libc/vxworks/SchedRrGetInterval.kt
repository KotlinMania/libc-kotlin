package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun schedRrGetInterval(pid: Int, tp: Timespec?): Int
