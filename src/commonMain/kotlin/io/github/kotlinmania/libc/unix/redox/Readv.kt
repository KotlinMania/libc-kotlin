// port-lint: source unix/redox/mod.rs
package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long
