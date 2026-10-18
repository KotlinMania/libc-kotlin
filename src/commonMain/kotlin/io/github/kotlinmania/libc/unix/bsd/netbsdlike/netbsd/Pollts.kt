package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Timespec

public expect fun pollts(fds: Pollfd?, nfds: UInt, ts: Timespec?, sigmask: SigsetT?): Int
