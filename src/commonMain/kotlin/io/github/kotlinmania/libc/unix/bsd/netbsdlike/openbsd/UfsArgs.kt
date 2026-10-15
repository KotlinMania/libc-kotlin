package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class UfsArgs(
    val fspec: String?,
    val exportInfo: ExportArgs,
)
