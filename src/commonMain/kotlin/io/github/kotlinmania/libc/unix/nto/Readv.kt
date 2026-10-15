// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long
