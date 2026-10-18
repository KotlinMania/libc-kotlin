package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun getnameinfo(sa: Sockaddr?, salen: Int, host: String?, hostlen: Int, serv: String?, sevlen: Int, flags: Int): Int
