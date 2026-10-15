// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long
