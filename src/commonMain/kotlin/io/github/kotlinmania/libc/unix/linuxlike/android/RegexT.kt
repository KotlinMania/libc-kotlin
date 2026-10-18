package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class RegexT(
    val reMagic: Int,
    val reNsub: ULong,
    val reEndp: String?,
    val reGuts: COpaquePointer?,
)
