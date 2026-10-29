// port-lint: source unix/bsd/netbsdlike/openbsd/aarch64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class Sigcontext(
    val scMask: Int,
    val scSp: ULong,
    val scLr: ULong,
    val scElr: ULong,
    val scSpsr: ULong,
    val scX: ULongArray,
    val scCookie: Long,
)

public const val _MAX_PAGE_SHIFT: UInt = 12u
