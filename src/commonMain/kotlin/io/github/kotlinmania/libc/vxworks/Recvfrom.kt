// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun recvfrom(s: Int, buf: COpaquePointer?, bufLen: ULong, flags: Int, from: Sockaddr?, pFromLen: UInt?): Long
