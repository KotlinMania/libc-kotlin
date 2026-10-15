// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Aiocb(
    val aioFildes: Int,
    val aioLioOpcode: Int,
    val aioReqprio: Int,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioSigevent: Sigevent,
    val td: COpaquePointer?,
    val lock: IntArray,
    val err: Int,
    val ret: Long,
    val aioOffset: Long,
    val next: COpaquePointer?,
    val prev: COpaquePointer?,
    val dummy4: ByteArray,
    val dummy42: ByteArray,
)
