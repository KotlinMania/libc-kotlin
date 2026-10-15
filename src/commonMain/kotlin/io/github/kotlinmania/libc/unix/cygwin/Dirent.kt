// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public data class Dirent(
    val dVersion: UInt,
    val dIno: ULong,
    val dType: UByte,
    val dInternal1: UInt,
    val dName: ByteArray,
)
