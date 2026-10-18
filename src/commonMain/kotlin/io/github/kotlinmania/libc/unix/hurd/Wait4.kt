package io.github.kotlinmania.libc.unix.hurd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Rusage

public expect fun wait4(pid: Int, status: Int?, options: Int, rusage: Rusage?): Int
