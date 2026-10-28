package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*

public data class Kevent(
    val ident: ULong,
    val filter: Short,
    val flags: UShort,
    val fflags: UInt,
    val data: Long,
    val udata: COpaquePointer?,
)
