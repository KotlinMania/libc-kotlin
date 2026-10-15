// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Dirent(
    val dIno: ULong,
    val dReclen: UShort,
    val dType: UByte,
    val dNamlen: UByte,
    val dName: ByteArray,
)
