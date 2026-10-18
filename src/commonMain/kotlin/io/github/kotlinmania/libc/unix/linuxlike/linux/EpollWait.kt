package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.EpollEvent

public expect fun epollWait(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Int): Int
