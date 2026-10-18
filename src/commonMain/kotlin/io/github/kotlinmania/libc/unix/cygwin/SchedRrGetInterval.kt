package io.github.kotlinmania.libc.unix.cygwin
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public expect fun schedRrGetInterval(pid: Int, t: Timespec?): Int
