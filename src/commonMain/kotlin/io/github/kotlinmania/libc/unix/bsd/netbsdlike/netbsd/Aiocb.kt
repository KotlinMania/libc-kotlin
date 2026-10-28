package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class Aiocb(
    val aioOffset: Long,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioFildes: Int,
    val aioLioOpcode: Int,
    val aioReqprio: Int,
    val aioSigevent: Sigevent,
    val state: Int,
    val _errno: Int,
    val retval: Long,
)
