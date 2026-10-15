// port-lint: source unix/redox/mod.rs
package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun epollCtl(epfd: Int, op: Int, fd: Int, event: EpollEvent?): Int
