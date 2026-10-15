// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Kevent64S(
    val ident: ULong,
    val filter: Short,
    val flags: UShort,
    val fflags: UInt,
    val data: Long,
    val udata: ULong,
    val ext: ULongArray,
)
