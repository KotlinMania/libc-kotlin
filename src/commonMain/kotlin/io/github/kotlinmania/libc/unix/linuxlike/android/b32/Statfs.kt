// port-lint: source unix/linux_like/android/b32/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b32

import io.github.kotlinmania.libc.*

public data class Statfs(
    val fType: UInt,
    val fBsize: UInt,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: ULong,
    val fNamelen: UInt,
    val fFrsize: UInt,
    val fFlags: UInt,
    val fSpare: UIntArray,
)
