// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Dqblk(
    val dqbBhardlimit: ULong,
    val dqbBsoftlimit: ULong,
    val dqbCurbytes: ULong,
    val dqbIhardlimit: UInt,
    val dqbIsoftlimit: UInt,
    val dqbCurinodes: UInt,
    val dqbBtime: UInt,
    val dqbItime: UInt,
    val dqbId: UInt,
    val dqbSpare: UIntArray,
)
