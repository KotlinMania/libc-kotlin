package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.unix.bsd.Sockaddr

import io.github.kotlinmania.libc.*

public expect fun realhostnameSa(host: String?, hsize: ULong, addr: Sockaddr?, addrlen: Int): Int
