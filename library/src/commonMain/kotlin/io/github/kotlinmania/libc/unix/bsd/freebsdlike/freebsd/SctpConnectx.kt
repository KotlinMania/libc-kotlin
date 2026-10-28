package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.Sockaddr

public expect fun sctpConnectx(s: Int, addrs: Sockaddr?, addrcnt: Int, id: UInt?): Int
