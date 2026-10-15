// port-lint: source unix/linux_like/emscripten/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public expect fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long
