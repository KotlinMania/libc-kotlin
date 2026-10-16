package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public expect fun backtraceSymbolsFd(buffer: COpaquePointer?, len: Int, fd: Int)
