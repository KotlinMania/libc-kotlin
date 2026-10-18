package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class Kevent(
    val ident: ULong,
    val filter: Short,
    val flags: UShort,
    val fflags: UInt,
    val data: Long,
    val udata: COpaquePointer?,
)
