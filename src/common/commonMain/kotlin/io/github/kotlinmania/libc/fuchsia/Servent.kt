package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Servent(
    val sName: String?,
    val sAliases: COpaquePointer?,
    val sPort: Int,
    val sProto: String?,
)
