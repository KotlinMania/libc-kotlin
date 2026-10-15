// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Sockcred(
    val scUid: UInt,
    val scEuid: UInt,
    val scGid: UInt,
    val scEgid: UInt,
    val scNgroups: Int,
    val scGroups: List<UInt>,
)
