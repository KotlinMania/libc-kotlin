// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class ProcBsdinfo(
    val pbiFlags: UInt,
    val pbiStatus: UInt,
    val pbiXstatus: UInt,
    val pbiPid: UInt,
    val pbiPpid: UInt,
    val pbiUid: UInt,
    val pbiGid: UInt,
    val pbiRuid: UInt,
    val pbiRgid: UInt,
    val pbiSvuid: UInt,
    val pbiSvgid: UInt,
    val rfu1: UInt,
    val pbiComm: ByteArray,
    val pbiName: ByteArray,
    val pbiNfiles: UInt,
    val pbiPgid: UInt,
    val pbiPjobc: UInt,
    val eTdev: UInt,
    val eTpgid: UInt,
    val pbiNice: Int,
    val pbiStartTvsec: ULong,
    val pbiStartTvusec: ULong,
)
