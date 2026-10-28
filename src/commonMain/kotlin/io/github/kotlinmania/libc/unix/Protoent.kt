package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public data class Protoent(
    val pName: String?,
    val pAliases: COpaquePointer?,
    val pProto: Int,
    val pProto2: Short,
)
