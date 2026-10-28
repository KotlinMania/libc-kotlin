package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class IpcPerm(
    val uid: UInt,
    val gid: UInt,
    val cuid: UInt,
    val cgid: UInt,
    val mode: UInt,
    val seq: UShort,
    val key: Int,
)
