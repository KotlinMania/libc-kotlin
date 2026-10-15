// port-lint: source unix/bsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: UInt,
    val msgIov: Iovec?,
    val msgIovlen: Int,
    val msgControl: COpaquePointer?,
    val msgControllen: UInt,
    val msgFlags: Int,
    val handle: Long = 0L,
)
