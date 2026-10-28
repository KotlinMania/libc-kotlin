package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Hostent(
    val hName: String?,
    val hAliases: COpaquePointer?,
    val hAddrtype: Int,
    val hLength: Int,
    val hAddrList: COpaquePointer?,
)
