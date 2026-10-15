// port-lint: source unix/newlib/rtems/mod.rs
package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.*

public expect fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long
