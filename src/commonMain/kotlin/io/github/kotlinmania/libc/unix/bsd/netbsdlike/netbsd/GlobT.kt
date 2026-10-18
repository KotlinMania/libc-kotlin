package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class GlobT(
    val glPathc: ULong,
    val glMatchc: ULong,
    val glOffs: ULong,
    val glFlags: Int,
    val glPathv: COpaquePointer?,
)
