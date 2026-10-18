package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

public expect fun getnameinfo(
    sa: Sockaddr?,
    salen: UInt,
    host: ByteArray?,
    hostlen: UInt,
    serv: ByteArray?,
    servlen: UInt,
    flags: Int,
): Int
