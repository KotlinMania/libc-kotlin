package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.bsd.Sockaddr

import io.github.kotlinmania.libc.*

public expect fun sctpSendv(sd: Int, iov: Iovec?, iovcnt: Int, addrs: Sockaddr?, addrcnt: Int, info: COpaquePointer?, infolen: UInt, infotype: UInt, flags: Int): Long
