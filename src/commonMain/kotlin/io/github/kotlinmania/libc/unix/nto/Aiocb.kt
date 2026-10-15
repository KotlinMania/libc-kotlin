// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class Aiocb(
    val aioFildes: Int,
    val aioReqprio: Int,
    val aioOffset: Long,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioSigevent: Sigevent,
    val aioLioOpcode: Int,
    val aioLioState: COpaquePointer?,
    val aioNext: Aiocb?,
    val aioFlag: UInt,
    val aioIotype: UInt,
    val aioResult: Long,
    val aioError: UInt,
    val aioSuspend: COpaquePointer?,
    val aioPlist: COpaquePointer?,
    val aioPolicy: Int,
    val aioParam: SchedParam,
)
