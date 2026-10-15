// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Dirent64(
    val dIno: ULong,
    val dOff: Long,
    val dReclen: UShort,
    val dType: UByte,
    val dName: ByteArray,
)
