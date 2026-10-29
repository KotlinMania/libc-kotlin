package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: ULong, flags: UInt, clockid: UInt, deadline: ULong): Int
