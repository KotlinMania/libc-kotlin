package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public expect fun pollts(fds: Pollfd?, nfds: UInt, ts: Timespec?, sigmask: SigsetT?): Int
