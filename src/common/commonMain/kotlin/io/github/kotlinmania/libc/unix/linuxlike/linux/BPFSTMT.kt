package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.SockFilter

public fun bpfStmt(code: UShort, k: UInt): SockFilter = SockFilter(code = code, jt = 0u, jf = 0u, k = k)
