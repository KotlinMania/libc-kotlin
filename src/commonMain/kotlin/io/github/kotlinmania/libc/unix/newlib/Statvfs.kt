package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public data class Statvfs(
    val fBsize: ULong,
    val fFrsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: UInt,
    val fFfree: UInt,
    val fFavail: UInt,
    val fFsid: ULong,
    val fFlag: ULong,
    val fNamemax: ULong,
)
