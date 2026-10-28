package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun schedRrGetInterval(pid: Int, tp: Timespec?): Int
