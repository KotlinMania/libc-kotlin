package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun schedRrGetInterval(pid: Int, tp: Timespec?): Int
