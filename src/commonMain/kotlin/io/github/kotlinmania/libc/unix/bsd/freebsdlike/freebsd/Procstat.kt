// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Procstat(
    val tpe: Int,
    val kd: ULong,
    val vmentries: COpaquePointer?,
    val files: COpaquePointer?,
    val argv: COpaquePointer?,
    val envv: COpaquePointer?,
    val core: ULong,
)
