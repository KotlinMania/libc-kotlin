package io.github.kotlinmania.libc.unix.linuxlike.android
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Timespec

public expect fun ppoll(fds: Pollfd?, nfds: UInt, timeout: Timespec?, sigmask: ULong?): Int
