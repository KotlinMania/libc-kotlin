// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class IpcPerm(
    val uid: UInt,
    val gid: UInt,
    val cuid: UInt,
    val cgid: UInt,
    val mode: UShort,
    val seq: UShort,
    val key: Int,
)
