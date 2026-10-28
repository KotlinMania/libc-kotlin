package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class SockaddrIn6(
    val sin6Len: UByte,
    val sin6Family: UByte,
    val sin6Port: UShort,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)
