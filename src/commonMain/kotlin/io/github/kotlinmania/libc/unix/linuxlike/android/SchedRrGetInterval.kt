package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun schedRrGetInterval(pid: Int, tp: Timespec?): Int
