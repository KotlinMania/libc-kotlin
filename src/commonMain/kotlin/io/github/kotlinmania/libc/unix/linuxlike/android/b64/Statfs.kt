// port-lint: source unix/linux_like/android/b64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.*

public data class Statfs(
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
