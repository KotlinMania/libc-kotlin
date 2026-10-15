// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class InPktinfo(
    val ipiIfindex: UInt,
    val ipiSpecDst: InAddr,
    val ipiAddr: InAddr,
)
