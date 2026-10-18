package io.github.kotlinmania.libc.unix.linuxlike.android
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.EpollEvent

public expect fun epollCtl(epfd: Int, op: Int, fd: Int, event: EpollEvent?): Int
