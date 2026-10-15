package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun sendmsg(fd: Int, msg: Msghdr?, flags: Int): Long
