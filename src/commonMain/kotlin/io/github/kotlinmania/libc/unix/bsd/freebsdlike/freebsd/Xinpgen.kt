// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Xinpgen(
    val xigLen: ULong,
    val xigCount: UInt,
    val xigSpare32: UInt,
    val xigGen: ULong,
    val xigSogen: ULong,
    val xigSpare64: ULongArray,
)
