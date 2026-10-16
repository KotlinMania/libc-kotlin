package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun sctpGetpaddrs(s: Int, asocid: UInt, addrs: COpaquePointer?): Int
