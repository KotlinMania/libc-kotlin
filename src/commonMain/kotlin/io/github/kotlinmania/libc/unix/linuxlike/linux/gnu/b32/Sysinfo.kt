// port-lint: source unix/linux_like/linux/gnu/b32/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32

import io.github.kotlinmania.libc.*

public data class Sysinfo(
    val uptime: Long,
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
    val f: ByteArray,
)
