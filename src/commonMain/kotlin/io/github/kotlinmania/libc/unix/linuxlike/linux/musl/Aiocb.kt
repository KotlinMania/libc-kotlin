// port-lint: source unix/linux_like/linux/musl/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

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
)
