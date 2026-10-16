package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*

public data class IpcPerm(
    val key: Int,
    val uid: UInt,
    val gid: UInt,
    val cuid: UInt,
    val cgid: UInt,
    val mode: UShort,
    val mode2: UInt,
    val pad1: UShort,
    val seq: UShort,
    val pad2: UShort,
    val unused1: ULong,
    val unused2: ULong,
)
