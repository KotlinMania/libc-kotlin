// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public data class PtraceIoDesc(
    val piodOp: Int,
    val piodOffs: COpaquePointer?,
    val piodAddr: COpaquePointer?,
    val piodLen: ULong,
)
