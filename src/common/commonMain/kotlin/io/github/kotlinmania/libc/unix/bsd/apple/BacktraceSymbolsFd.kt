package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: Int, fd: Int)
