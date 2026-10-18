package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class PthreadRwlockattrT(
    val ptraMagic: UInt,
    val ptraPrivate: COpaquePointer?,
)
