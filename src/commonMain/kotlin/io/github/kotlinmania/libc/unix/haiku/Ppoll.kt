package io.github.kotlinmania.libc.unix.haiku
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public expect fun ppoll(fds: Pollfd?, numfds: ULong, timeout: Timespec?, sigMask: ULong?): Int
