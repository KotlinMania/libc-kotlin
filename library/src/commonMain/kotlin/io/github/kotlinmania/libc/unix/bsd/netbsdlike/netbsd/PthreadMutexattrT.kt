package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class PthreadMutexattrT(
    val ptmaMagic: UInt,
    val ptmaPrivate: COpaquePointer?,
)
