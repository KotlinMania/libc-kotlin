// port-lint: source unix/newlib/vita/mod.rs
package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*

public data class SockaddrIn6(
    val sin6Len: UByte,
    val sin6Family: UShort,
    val sin6Port: UShort,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6Vport: UShort,
    val sin6ScopeId: UInt,
)
