package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class PtraceVmEntry(
    val pveEntry: Int,
    val pveTimestamp: Int,
    val pveStart: ULong,
    val pveEnd: ULong,
    val pveOffset: ULong,
    val pveProt: UInt,
    val pvePathlen: UInt,
    val pveFileid: Long,
    val pveFsid: UInt,
    val pvePath: String?,
)
