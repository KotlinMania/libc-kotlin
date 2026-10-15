// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Statvfs64(
    val fType: UInt,
    val fBsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: ULong,
    val fNamemax: ULong,
    val fFavail: ULong,
    val fFrsize: ULong,
    val fFlag: ULong,
    val fSpare: UIntArray,
)
