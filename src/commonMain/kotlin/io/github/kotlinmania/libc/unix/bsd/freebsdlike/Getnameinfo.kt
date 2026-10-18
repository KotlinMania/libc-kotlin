package io.github.kotlinmania.libc.unix.bsd.freebsdlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.Sockaddr

public expect fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: Int): Int
