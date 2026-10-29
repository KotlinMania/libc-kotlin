package io.github.kotlinmania.libc.unix.nuttx
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun clockGettime(clockid: Int, tp: Timespec?): Int
