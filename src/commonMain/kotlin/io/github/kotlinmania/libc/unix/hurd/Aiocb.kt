// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Aiocb(
    val aioFildes: Int,
    val aioLioOpcode: Int,
    val aioReqprio: Int,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioSigevent: Sigevent,
    val nextPrio: Aiocb?,
    val absPrio: Int,
    val policy: Int,
    val errorCode: Int,
    val returnValue: Int,
    val aioOffset: Long,
)
