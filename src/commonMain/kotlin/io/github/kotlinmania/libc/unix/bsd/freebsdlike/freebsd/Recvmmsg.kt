package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: ULong, flags: Int, timeout: Timespec?): Long
