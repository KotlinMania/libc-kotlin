// port-lint: source unix/linux_like/emscripten/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public data class Statfs(
    val fType: ULong,
    val fBsize: ULong,
    val fBlocks: UInt,
    val fBfree: UInt,
    val fBavail: UInt,
    val fFiles: UInt,
    val fFfree: UInt,
    val fFsid: FsidT,
    val fNamelen: ULong,
    val fFrsize: ULong,
    val fFlags: ULong,
    val fSpare: ULongArray,
)
