// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long
