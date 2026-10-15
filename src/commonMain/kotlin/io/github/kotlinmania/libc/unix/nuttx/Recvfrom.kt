// port-lint: source unix/nuttx/mod.rs
package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public expect fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, srcAddr: Sockaddr?, addrlen: UInt?): Int
