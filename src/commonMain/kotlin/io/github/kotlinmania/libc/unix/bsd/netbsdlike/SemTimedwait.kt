package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun semTimedwait(sem: io.github.kotlinmania.libc.COpaquePointer?, abstime: Timespec?): Int
