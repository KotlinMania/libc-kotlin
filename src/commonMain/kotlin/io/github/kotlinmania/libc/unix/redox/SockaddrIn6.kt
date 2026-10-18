package io.github.kotlinmania.libc.unix.redox
import io.github.kotlinmania.libc.unix.In6Addr

import io.github.kotlinmania.libc.*

public data class SockaddrIn6(
    val sin6Family: UShort,
    val sin6Port: UShort,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)
