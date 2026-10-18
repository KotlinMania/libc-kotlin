package io.github.kotlinmania.libc.unix.newlib
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

public expect fun recvfrom(fd: Int, buf: COpaquePointer?, n: ULong, flags: Int, addr: Sockaddr?, addrLen: UInt?): Long
