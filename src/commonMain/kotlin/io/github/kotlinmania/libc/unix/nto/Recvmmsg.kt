// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: UInt, timeout: Timespec?): Int
