package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*

public data class Statfs64(
    val fType: ULong,
    val fBsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: ULong,
    val fNamelen: ULong,
    val fFrsize: ULong,
    val fFlags: ULong,
    val fSpare: ULongArray,
)
