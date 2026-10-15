// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Statvfs(
    val fBavail: ULong,
    val fBfree: ULong,
    val fBlocks: ULong,
    val fFavail: ULong,
    val fFfree: ULong,
    val fFiles: ULong,
    val fBsize: ULong,
    val fFlag: ULong,
    val fFrsize: ULong,
    val fFsid: ULong,
    val fNamemax: ULong,
)
