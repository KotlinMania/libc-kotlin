// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class SegmentCommand(
    val cmd: UInt,
    val cmdsize: UInt,
    val segname: ByteArray,
    val vmaddr: UInt,
    val vmsize: UInt,
    val fileoff: UInt,
    val filesize: UInt,
    val maxprot: Int,
    val initprot: Int,
    val nsects: UInt,
    val flags: UInt,
)
