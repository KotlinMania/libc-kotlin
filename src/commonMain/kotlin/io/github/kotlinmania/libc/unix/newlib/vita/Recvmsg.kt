package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*

public expect fun recvmsg(s: Int, msg: Msghdr?, flags: Int): Long
