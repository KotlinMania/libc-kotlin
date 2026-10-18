package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun getnameinfo(addr: Sockaddr?, addrlen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int
