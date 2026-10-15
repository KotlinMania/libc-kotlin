package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class PthreadCondT(
    val ptcMagic: UInt,
    val ptcLock: Byte,
    val ptcWaitersFirst: COpaquePointer?,
    val ptcWaitersLast: COpaquePointer?,
    val ptcMutex: PthreadMutexT?,
    val ptcPrivate: COpaquePointer?,
)
