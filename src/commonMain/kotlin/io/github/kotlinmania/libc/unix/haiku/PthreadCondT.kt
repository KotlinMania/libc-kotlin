package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class PthreadCondT(
    val flags: UInt,
    val mutex: COpaquePointer?,
    val waiterCount: Int,
    val lock: Int,
)
