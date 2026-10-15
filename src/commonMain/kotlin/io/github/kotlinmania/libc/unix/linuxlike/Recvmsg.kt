// port-lint: source unix/linux_like/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun recvmsg(fd: Int, msg: Msghdr?, flags: Int): Long
