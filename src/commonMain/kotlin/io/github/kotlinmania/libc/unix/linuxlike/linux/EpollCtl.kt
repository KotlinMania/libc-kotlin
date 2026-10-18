package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun epollCtl(epfd: Int, op: Int, fd: Int, event: EpollEvent?): Int
