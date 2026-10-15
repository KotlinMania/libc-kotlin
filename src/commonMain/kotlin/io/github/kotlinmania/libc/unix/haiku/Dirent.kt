// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class Dirent(
    val dDev: Int,
    val dPdev: Int,
    val dIno: Long,
    val dPino: Long,
    val dReclen: UShort,
    val dName: ByteArray,
)
