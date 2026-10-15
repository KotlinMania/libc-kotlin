// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Sysinfo(
    val uptime: ULong,
    val loads: ULongArray,
    val totalram: ULong,
    val freeram: ULong,
    val sharedram: ULong,
    val bufferram: ULong,
    val totalswap: ULong,
    val freeswap: ULong,
    val procs: UShort,
    val pad: UShort,
    val totalhigh: ULong,
    val freehigh: ULong,
    val memUnit: UInt,
)
