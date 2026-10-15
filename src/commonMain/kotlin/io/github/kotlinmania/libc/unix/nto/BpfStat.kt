// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class BpfStat(
    val bsRecv: ULong,
    val bsDrop: ULong,
    val bsCapt: ULong,
)
