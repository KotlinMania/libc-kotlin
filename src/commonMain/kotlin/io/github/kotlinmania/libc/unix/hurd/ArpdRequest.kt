package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class ArpdRequest(
    val req: UShort,
    val ip: UInt,
    val dev: ULong,
    val stamp: ULong,
    val updated: ULong,
    val ha: UByteArray,
)
