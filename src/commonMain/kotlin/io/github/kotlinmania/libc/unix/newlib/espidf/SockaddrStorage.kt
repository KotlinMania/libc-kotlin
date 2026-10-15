package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*

public data class SockaddrStorage(
    val s2Len: UByte,
    val ssFamily: UShort,
    val s2Data1: ByteArray,
    val s2Data2: UIntArray,
    val s2Data3: UIntArray,
)
