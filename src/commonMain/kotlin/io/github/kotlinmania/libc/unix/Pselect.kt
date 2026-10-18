package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.unix.linuxlike.FdSet

import io.github.kotlinmania.libc.*

public expect fun pselect(nfds: Int, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timespec?, sigmask: ULong?): Int
