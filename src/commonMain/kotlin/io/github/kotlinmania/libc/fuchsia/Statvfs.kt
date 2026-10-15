// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

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
    val fFsid2: ULong,
    val fFlag: ULong,
    val fNamemax: ULong,
    val fSpare: IntArray,
)
