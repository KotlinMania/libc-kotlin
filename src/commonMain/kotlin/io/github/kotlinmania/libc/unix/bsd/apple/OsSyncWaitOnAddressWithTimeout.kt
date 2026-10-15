// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: ULong, flags: UInt, clockid: UInt, timeoutNs: ULong): Int
