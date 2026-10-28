package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun recvmsg(fd: Int, msg: Msghdr?, flags: Int): Long
