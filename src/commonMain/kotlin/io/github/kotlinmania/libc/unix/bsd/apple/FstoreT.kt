// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class FstoreT(
    val fstFlags: UInt,
    val fstPosmode: Int,
    val fstOffset: Long,
    val fstLength: Long,
    val fstBytesalloc: Long,
)
