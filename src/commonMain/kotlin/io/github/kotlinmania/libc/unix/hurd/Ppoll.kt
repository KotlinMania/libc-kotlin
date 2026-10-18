package io.github.kotlinmania.libc.unix.hurd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Pollfd

public expect fun ppoll(fds: Pollfd?, nfds: ULong, timeout: Timespec?, sigmask: ULong?): Int
