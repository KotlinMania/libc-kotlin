// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Statfs64(
    val fType: ULong,
    val fBsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: FsidT,
    val fNamelen: ULong,
    val fFrsize: ULong,
    val fFlags: ULong,
    val fSpare: ULongArray,
)
