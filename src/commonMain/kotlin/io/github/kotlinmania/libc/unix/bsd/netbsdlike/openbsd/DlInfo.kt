package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class DlInfo(
    val dliFname: String?,
    val dliFbase: COpaquePointer?,
    val dliSname: String?,
    val dliSaddr: COpaquePointer?,
)
