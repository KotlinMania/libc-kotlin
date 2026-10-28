package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: ULong, flags: UInt): Int
