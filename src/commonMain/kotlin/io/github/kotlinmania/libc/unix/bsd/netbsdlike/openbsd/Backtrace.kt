package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public expect fun backtrace(addrlist: COpaquePointer?, len: ULong): ULong
