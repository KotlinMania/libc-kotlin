// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun epollCtl(epfd: Int, op: Int, fd: Int, event: EpollEvent?): Int
