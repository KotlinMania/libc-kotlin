package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Aiocb(
    val aioFildes: Int,
    val aioOffset: Long,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioReqprio: Int,
    val aioSigevent: Sigevent,
    val aioLioOpcode: Int,
)
