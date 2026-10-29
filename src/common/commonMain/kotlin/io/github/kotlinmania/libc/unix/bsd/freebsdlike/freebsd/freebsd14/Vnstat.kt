package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14

import io.github.kotlinmania.libc.*

public data class Vnstat(
    val vnFileid: ULong,
    val vnSize: ULong,
    val vnDev: ULong,
    val vnFsid: ULong,
    val vnMntdir: String?,
    val vnType: Int,
    val vnMode: UShort,
    val vnDevname: ByteArray,
)
