// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class KvmSwap(
    val kswDevname: ByteArray,
    val kswUsed: UInt,
    val kswTotal: UInt,
    val kswFlags: Int,
)
