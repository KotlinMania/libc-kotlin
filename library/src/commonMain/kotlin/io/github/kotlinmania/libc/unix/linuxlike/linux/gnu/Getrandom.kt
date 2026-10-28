package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public expect fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long
