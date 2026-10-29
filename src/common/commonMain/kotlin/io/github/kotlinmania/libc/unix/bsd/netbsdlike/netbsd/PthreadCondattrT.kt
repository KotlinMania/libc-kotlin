package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class PthreadCondattrT(
    val ptcaMagic: UInt,
    val ptcaPrivate: COpaquePointer?,
)
