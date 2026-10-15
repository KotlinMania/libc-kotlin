// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: Int): Int
