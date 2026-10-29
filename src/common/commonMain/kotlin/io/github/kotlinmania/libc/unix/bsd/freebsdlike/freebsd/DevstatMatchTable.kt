package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class DevstatMatchTable(
    val matchStr: String?,
    val type: DevstatTypeFlags,
    val matchField: DevstatMatchFlags,
)
