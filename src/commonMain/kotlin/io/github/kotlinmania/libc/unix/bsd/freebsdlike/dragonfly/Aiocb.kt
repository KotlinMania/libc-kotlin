// port-lint: source unix/bsd/freebsdlike/dragonfly/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class Aiocb(
    val aioFildes: Int,
    val aioOffset: Long,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioSigevent: Sigevent,
    val aioLioOpcode: Int,
    val aioReqprio: Int,
    val aioVal: Int,
    val aioErr: Int,
)
