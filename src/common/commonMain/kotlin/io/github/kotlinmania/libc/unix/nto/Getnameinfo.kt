package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int
