package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun wait4(pid: Int, status: Int?, options: Int, rusage: Rusage?): Int
