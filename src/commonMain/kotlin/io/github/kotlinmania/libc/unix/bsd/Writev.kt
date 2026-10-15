// port-lint: source unix/bsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public expect fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long
