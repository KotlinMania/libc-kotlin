package io.github.kotlinmania.libc.new.musl.sys

import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.linuxlike.Mmsghdr

public actual fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: UInt): Int =
    throw UnsupportedOperationException("sendmmsg requires N-API addon")

public actual fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: UInt, timeout: Timespec?): Int =
    throw UnsupportedOperationException("recvmmsg requires N-API addon")
