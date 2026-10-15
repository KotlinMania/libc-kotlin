// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Statvfs(
    val fBsize: ULong,
    val fFrsize: ULong,
    val fBlocks: UInt,
    val fBfree: UInt,
    val fBavail: UInt,
    val fFiles: UInt,
    val fFfree: UInt,
    val fFavail: UInt,
    val fFsid: ULong,
    val fFlag: ULong,
    val fNamemax: ULong,
)
