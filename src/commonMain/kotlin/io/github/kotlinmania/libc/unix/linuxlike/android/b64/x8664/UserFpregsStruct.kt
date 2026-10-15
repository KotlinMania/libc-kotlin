// port-lint: source unix/linux_like/android/b64/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b64.x8664

import io.github.kotlinmania.libc.*

public data class UserFpregsStruct(
    val cwd: UShort,
    val swd: UShort,
    val ftw: UShort,
    val fop: UShort,
    val rip: ULong,
    val rdp: ULong,
    val mxcsr: UInt,
    val mxcrMask: UInt,
    val stSpace: UIntArray,
    val xmmSpace: UIntArray,
)
