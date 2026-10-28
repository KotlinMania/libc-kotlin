package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun schedRrGetInterval(pid: Int, tp: Timespec?): Int
