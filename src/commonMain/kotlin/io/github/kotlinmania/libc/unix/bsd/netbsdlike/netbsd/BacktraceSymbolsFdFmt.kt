package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun backtraceSymbolsFdFmt(addrlist: COpaquePointer?, len: ULong, fd: Int, fmt: String?): Int
