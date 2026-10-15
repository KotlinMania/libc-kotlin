// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class Sockcred(
    val scUid: UInt,
    val scEuid: UInt,
    val scGid: UInt,
    val scEgid: UInt,
    val scNgroups: Int,
    val scGroups: List<UInt>,
)
