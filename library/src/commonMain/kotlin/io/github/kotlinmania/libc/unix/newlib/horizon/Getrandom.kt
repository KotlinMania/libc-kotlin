package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*

public expect fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long
