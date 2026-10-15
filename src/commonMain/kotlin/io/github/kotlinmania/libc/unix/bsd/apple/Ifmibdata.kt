// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Ifmibdata(
    val ifmdName: ByteArray,
    val ifmdPcount: UInt,
    val ifmdFlags: UInt,
    val ifmdSndLen: UInt,
    val ifmdSndMaxlen: UInt,
    val ifmdSndDrops: UInt,
    val ifmdFiller: UIntArray,
    val ifmdData: IfData64,
)
