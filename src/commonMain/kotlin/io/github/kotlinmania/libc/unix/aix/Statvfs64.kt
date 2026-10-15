// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class Statvfs64(
    val fBsize: ULong,
    val fFrsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFavail: ULong,
    val fFsid: Fsid64T,
    val fBasetype: ByteArray,
    val fFlag: ULong,
    val fNamemax: ULong,
    val fFstr: ByteArray,
    val fFiller: ULongArray,
)
