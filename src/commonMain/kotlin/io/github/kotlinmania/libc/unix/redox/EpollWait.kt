package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun epollWait(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Int): Int
