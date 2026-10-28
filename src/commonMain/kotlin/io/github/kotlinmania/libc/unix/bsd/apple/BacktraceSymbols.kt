package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun backtraceSymbols(addrs: COpaquePointer?, sz: Int): COpaquePointer?
