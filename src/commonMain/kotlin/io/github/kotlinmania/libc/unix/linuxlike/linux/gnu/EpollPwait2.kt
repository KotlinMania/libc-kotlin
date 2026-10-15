// port-lint: source unix/linux_like/linux/gnu/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public expect fun epollPwait2(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Timespec?, sigmask: ULong?): Int
