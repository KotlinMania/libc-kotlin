package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class MsdosfsArgs(
    val fspec: String?,
    val exportInfo: ExportArgs,
    val uid: UInt,
    val gid: UInt,
    val mask: UInt,
    val flags: Int,
)
