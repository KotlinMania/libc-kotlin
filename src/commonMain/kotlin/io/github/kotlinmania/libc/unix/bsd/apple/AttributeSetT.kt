// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class AttributeSetT(
    val commonattr: UInt,
    val volattr: UInt,
    val dirattr: UInt,
    val fileattr: UInt,
    val forkattr: UInt,
)
