// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class Kevent(
    val ident: ULong,
    val filter: UInt,
    val flags: UInt,
    val fflags: UInt,
    val data: Long,
    val udata: COpaquePointer?,
)
