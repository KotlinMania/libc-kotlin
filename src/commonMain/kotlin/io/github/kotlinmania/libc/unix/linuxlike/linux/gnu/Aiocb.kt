// port-lint: source unix/linux_like/linux/gnu/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

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
    val returnValue: Long,
    val aioOffset: Long,
)
