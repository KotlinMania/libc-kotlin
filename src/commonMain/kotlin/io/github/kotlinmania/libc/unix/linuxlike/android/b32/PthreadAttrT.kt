package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.*

public data class PthreadAttrT(
    val flags: UInt,
    val stackBase: COpaquePointer?,
    val stackSize: ULong,
    val guardSize: ULong,
    val schedPolicy: Int,
    val schedPriority: Int,
)
