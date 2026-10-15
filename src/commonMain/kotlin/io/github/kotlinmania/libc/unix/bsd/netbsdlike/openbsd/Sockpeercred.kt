// port-lint: source unix/bsd/netbsdlike/openbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class Sockpeercred(
    val uid: UInt,
    val gid: UInt,
    val pid: Int,
)
