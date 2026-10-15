// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class Statvfs(
    val fBsize: ULong,
    val fFrsize: ULong,
    val fBlocks: Long,
    val fBfree: Long,
    val fBavail: Long,
    val fFiles: Long,
    val fFfree: Long,
    val fFavail: Long,
    val fFsid: ULong,
    val fFlag: ULong,
    val fNamemax: ULong,
)
