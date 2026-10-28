package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun accept(s: Int, addr: Sockaddr?, addrlen: UInt?): Int
