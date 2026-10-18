package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.unix.linuxlike.EpollEvent

import io.github.kotlinmania.libc.*

public expect fun epollPwait(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Int, sigmask: ULong?): Int
