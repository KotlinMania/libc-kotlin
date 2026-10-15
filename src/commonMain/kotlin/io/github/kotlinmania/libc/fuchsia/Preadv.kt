// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long
