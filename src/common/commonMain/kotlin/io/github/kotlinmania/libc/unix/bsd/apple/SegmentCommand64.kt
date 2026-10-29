package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class SegmentCommand64(
    val cmd: UInt,
    val cmdsize: UInt,
    val segname: ByteArray,
    val vmaddr: ULong,
    val vmsize: ULong,
    val fileoff: ULong,
    val filesize: ULong,
    val maxprot: Int,
    val initprot: Int,
    val nsects: UInt,
    val flags: UInt,
)
