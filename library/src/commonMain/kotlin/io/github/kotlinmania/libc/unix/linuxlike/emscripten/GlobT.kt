package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public data class GlobT(
    val glPathc: ULong,
    val glPathv: COpaquePointer?,
    val glOffs: ULong,
    val glFlags: Int,
)
