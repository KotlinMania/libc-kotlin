// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Mstats(
    val bytesTotal: ULong,
    val chunksUsed: ULong,
    val bytesUsed: ULong,
    val chunksFree: ULong,
    val bytesFree: ULong,
)
