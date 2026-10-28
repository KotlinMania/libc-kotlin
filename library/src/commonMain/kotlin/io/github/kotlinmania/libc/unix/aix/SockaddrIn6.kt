package io.github.kotlinmania.libc.unix.aix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.In6Addr

public data class SockaddrIn6(
    val sin6Len: UByte,
    val sin6Family: UByte,
    val sin6Port: UShort,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)
