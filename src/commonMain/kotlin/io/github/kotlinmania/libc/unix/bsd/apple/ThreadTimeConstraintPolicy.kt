// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class ThreadTimeConstraintPolicy(
    val period: UInt,
    val computation: UInt,
    val constraint: UInt,
    val preemptible: Int,
)
