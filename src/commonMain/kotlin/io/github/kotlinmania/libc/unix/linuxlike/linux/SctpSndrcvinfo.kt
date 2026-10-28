package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class SctpSndrcvinfo(
    val sinfoStream: UShort,
    val sinfoSsn: UShort,
    val sinfoFlags: UShort,
    val sinfoPpid: UInt,
    val sinfoContext: UInt,
    val sinfoTimetolive: UInt,
    val sinfoTsn: UInt,
    val sinfoCumtsn: UInt,
    val sinfoAssocId: Int,
)
