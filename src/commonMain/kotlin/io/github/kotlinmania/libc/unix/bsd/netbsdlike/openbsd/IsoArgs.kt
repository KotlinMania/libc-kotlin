package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class IsoArgs(
    val fspec: String?,
    val exportInfo: ExportArgs,
    val flags: Int,
    val sess: Int,
)
