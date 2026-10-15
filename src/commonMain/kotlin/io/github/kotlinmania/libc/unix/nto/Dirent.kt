// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class Dirent(
    val dIno: ULong,
    val dOffset: Long,
    val dReclen: Short,
    val dNamelen: Short,
    val dName: ByteArray,
)
