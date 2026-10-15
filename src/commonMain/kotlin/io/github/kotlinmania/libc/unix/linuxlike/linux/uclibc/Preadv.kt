// port-lint: source unix/linux_like/linux/uclibc/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*

public expect fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long
