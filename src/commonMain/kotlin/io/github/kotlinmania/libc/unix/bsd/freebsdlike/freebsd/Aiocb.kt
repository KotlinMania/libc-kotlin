// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Aiocb(
    val aioFildes: Int,
    val aioOffset: Long,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val unused1: IntArray,
    val unused2: COpaquePointer?,
    val aioLioOpcode: Int,
    val aioReqprio: Int,
    val unused3: Long,
    val unused4: Long,
    val unused5: COpaquePointer?,
    val aioSigevent: Sigevent,
)
