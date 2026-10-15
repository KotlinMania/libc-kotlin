// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class XswUsage(
    val xsuTotal: ULong,
    val xsuAvail: ULong,
    val xsuUsed: ULong,
    val xsuPagesize: UInt,
    val xsuEncrypted: Int,
)
