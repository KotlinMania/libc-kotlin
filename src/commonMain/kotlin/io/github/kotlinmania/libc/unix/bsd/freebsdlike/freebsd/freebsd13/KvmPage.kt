// port-lint: source unix/bsd/freebsdlike/freebsd/freebsd13/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13

import io.github.kotlinmania.libc.*

public data class KvmPage(
    val kpVersion: UInt,
    val kpPaddr: ULong,
    val kpKmapVaddr: ULong,
    val kpDmapVaddr: ULong,
    val kpProt: Int,
    val kpOffset: Long,
    val kpLen: ULong,
)
