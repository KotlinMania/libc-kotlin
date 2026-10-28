package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class GlobT(
    val glPathc: ULong,
    val glMatchc: Int,
    val glPathv: COpaquePointer?,
    val glOffs: ULong,
    val glFlags: Int,
    val glErrfunc: GlobErrorHandler?,
)
