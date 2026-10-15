// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun recvmsg(fd: Int, msg: Msghdr?, flags: Int): Long
