// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun pwritev64(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Int
