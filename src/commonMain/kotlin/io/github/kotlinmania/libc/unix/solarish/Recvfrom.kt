package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long
