// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class In6Addrlifetime(
    val ia6tExpire: Long,
    val ia6tPreferred: Long,
    val ia6tVltime: UInt,
    val ia6tPltime: UInt,
)
