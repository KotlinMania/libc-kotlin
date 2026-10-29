package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun sendto(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt): Long
