// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class VnodeInfo(
    val viStat: VinfoStat,
    val viType: Int,
    val viPad: Int,
    val viFsid: ULong,
)
