// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: ULong, flags: UInt): Int
