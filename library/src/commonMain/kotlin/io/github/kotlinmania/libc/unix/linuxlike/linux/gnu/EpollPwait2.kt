package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.EpollEvent

public expect fun epollPwait2(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Timespec?, sigmask: ULong?): Int
