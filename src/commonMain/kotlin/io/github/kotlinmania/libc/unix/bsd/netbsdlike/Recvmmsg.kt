package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun recvmmsg(sockfd: Int, mmsg: Mmsghdr?, vlen: UInt, flags: Int, timeout: Timespec?): Int
