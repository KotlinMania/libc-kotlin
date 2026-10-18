package io.github.kotlinmania.libc.unix.bsd.netbsdlike
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public expect fun ppoll(fds: Pollfd?, nfds: UInt, ts: Timespec?, sigmask: ULong?): Int
