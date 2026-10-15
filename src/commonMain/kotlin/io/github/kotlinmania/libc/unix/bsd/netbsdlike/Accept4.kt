package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun accept4(s: Int, addr: Sockaddr?, addrlen: UInt?, flags: Int): Int
