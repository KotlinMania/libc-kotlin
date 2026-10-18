package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public data class Iocb(
    val aioData: ULong,
    val aioKey: UInt,
    val aioRwFlags: Int,
    val aioRwFlags2: Int,
    val aioKey2: UInt,
    val aioLioOpcode: UShort,
    val aioReqprio: Short,
    val aioFildes: UInt,
    val aioBuf: ULong,
    val aioNbytes: ULong,
    val aioOffset: Long,
    val aioFlags: UInt,
    val aioResfd: UInt,
)
