package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class Protoent(
    val pName: String?,
    val pAliases: COpaquePointer?,
    val pProto: Int,
)
