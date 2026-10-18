package io.github.kotlinmania.libc.unix.nto
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public expect fun semTimedwait(sem: io.github.kotlinmania.libc.unix.nto.SyncT?, abstime: Timespec?): Int
