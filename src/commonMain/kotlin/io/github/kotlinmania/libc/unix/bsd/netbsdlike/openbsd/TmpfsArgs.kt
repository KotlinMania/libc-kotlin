// port-lint: source unix/bsd/netbsdlike/openbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class TmpfsArgs(
    val taVersion: Int,
    val taNodesMax: ULong,
    val taSizeMax: Long,
    val taRootUid: UInt,
    val taRootGid: UInt,
    val taRootMode: UInt,
)
