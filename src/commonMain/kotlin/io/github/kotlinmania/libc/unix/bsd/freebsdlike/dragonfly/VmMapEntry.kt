// port-lint: source unix/bsd/freebsdlike/dragonfly/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class VmMapEntry(
    val priv: List<ULong>,
    val eflags: UInt,
    val maptype: UByte,
    val protection: UByte,
    val maxProtection: UByte,
    val inheritance: Byte,
    val wiredCount: Int,
    val id: Int,
)
