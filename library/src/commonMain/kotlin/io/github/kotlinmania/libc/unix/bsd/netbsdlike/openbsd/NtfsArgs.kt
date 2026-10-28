package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class NtfsArgs(
    val fspec: String?,
    val exportInfo: ExportArgs,
    val uid: UInt,
    val gid: UInt,
    val mode: UInt,
    val flag: ULong,
)
