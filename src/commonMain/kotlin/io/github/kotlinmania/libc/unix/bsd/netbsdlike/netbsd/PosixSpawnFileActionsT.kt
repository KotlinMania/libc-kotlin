// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class PosixSpawnFileActionsT(
    val size: UInt,
    val len: UInt,
    val fae: PosixSpawnFileActionsEntryT?,
)
