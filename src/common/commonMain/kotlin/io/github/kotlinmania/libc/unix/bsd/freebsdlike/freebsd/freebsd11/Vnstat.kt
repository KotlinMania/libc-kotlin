package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*

public data class Vnstat(
    val vnFileid: ULong,
    val vnSize: ULong,
    val vnMntdir: String?,
    val vnDev: UInt,
    val vnFsid: UInt,
    val vnType: Int,
    val vnMode: UShort,
    val vnDevname: ByteArray,
)
