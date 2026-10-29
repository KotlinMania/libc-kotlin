package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun taskForPid(host: UInt, pid: Int, task: UInt?): Int
