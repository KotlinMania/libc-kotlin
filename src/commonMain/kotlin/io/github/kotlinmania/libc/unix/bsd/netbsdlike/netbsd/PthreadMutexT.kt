package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class PthreadMutexT(
    val ptmMagic: UInt,
    val ptmErrorcheck: Byte,
    val ptmOwner: ULong,
    val ptmWaiters: COpaquePointer?,
    val ptmRecursed: UInt,
    val ptmSpare2: COpaquePointer?,
)
