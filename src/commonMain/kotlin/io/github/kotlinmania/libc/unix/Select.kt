// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun select(nfds: Int, readfds: FdSet?, writefds: FdSet?, errorfds: FdSet?, timeout: Timeval?): Int
