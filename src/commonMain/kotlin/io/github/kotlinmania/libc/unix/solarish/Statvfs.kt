package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class Statvfs(
    val fBsize: ULong,
    val fFrsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFavail: ULong,
    val fFsid: ULong,
    val fBasetype: ByteArray,
    val fFlag: ULong,
    val fNamemax: ULong,
    val fFstr: ByteArray,
)
