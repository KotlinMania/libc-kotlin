package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun recvmsg(socket: Int, msg: Msghdr?, flags: Int): Long
