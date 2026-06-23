// port-lint: source unix/bsd/netbsdlike/openbsd/aarch64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias UcontextT = Sigcontext

public data class Sigcontext(
    val scMask: CInt,
    val scSp: CULong,
    val scLr: CULong,
    val scElr: CULong,
    val scSpsr: CULong,
    val scX: ULongArray,
    val scCookie: CLong,
)

public const val _MAX_PAGE_SHIFT: UInt = 12u
