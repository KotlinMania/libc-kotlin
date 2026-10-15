// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public data class Hostent(
    val hName: String?,
    val hAliases: COpaquePointer?,
    val hAddrtype: Short,
    val hLength: Short,
    val hAddrList: COpaquePointer?,
)
