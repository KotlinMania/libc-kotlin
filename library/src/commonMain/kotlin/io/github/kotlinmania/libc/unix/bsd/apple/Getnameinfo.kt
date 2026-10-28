package io.github.kotlinmania.libc.unix.bsd.apple
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.Sockaddr

public expect fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int
