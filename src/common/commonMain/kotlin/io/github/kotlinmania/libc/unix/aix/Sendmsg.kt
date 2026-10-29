package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun sendmsg(sockfd: Int, msg: Msghdr?, flags: Int): Long
