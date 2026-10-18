package io.github.kotlinmania.libc.unix.solarish
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun semTimedwait(sem: SemT?, abstime: Timespec?): Int
