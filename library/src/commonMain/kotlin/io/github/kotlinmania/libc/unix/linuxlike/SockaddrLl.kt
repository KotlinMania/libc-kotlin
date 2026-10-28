package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public data class SockaddrLl(
    val sllFamily: UShort,
    val sllProtocol: UShort,
    val sllIfindex: Int,
    val sllHatype: UShort,
    val sllPkttype: UByte,
    val sllHalen: UByte,
    val sllAddr: UByteArray,
)
