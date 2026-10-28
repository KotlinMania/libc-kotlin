package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Ifdrv(
    val ifdName: ByteArray,
    val ifdCmd: ULong,
    val ifdLen: ULong,
    val ifdData: COpaquePointer?,
)
