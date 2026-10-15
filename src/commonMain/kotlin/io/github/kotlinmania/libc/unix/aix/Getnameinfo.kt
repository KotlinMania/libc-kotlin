// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun getnameinfo(sa: Sockaddr?, salen: ULong, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: Int): Int
