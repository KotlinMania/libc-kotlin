package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun backtraceSymbols(addrlist: COpaquePointer?, len: ULong): COpaquePointer?
