package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

import io.github.kotlinmania.libc.*

public expect fun getnameinfo(
    sa: Sockaddr?,
    salen: UInt,
    host: ByteArray?,
    hostlen: UInt,
    serv: ByteArray?,
    servlen: UInt,
    flags: Int,
): Int
