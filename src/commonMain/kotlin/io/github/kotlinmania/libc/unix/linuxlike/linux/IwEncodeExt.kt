package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

import io.github.kotlinmania.libc.*

public data class IwEncodeExt(
    val extFlags: UInt,
    val txSeq: List<UByte>,
    val rxSeq: List<UByte>,
    val addr: Sockaddr,
    val alg: UShort,
    val keyLen: UShort,
    val key: List<UByte>,
)
