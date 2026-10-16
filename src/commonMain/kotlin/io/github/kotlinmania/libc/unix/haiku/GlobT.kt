package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class GlobT(
    val glPathc: ULong,
    val glOffs: ULong,
    val glPathv: COpaquePointer?,
)
