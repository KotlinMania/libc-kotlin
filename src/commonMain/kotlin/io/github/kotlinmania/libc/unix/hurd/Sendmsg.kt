// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun sendmsg(fd: Int, message: Msghdr?, flags: Int): Int
