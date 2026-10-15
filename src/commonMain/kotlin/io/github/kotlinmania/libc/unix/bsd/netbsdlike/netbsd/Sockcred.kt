// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class Sockcred(
    val scPid: Int,
    val scUid: UInt,
    val scEuid: UInt,
    val scGid: UInt,
    val scEgid: UInt,
    val scNgroups: Int,
    val scGroups: List<UInt>,
)
