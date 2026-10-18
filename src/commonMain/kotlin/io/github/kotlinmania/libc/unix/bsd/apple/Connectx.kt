package io.github.kotlinmania.libc.unix.bsd.apple
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec

public expect fun connectx(socket: Int, endpoints: SaEndpointsT?, associd: UInt, flags: UInt, iov: Iovec?, iovcnt: UInt, len: ULong?, connid: UInt?): Int
