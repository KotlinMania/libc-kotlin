// port-lint: source unix/newlib/horizon/mod.rs
package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*

public data class SockaddrIn6(
    val sin6Family: UShort,
    val sin6Port: UShort,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)
