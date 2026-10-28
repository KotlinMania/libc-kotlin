package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class ProcTaskallinfo(
    val pbsd: ProcBsdinfo,
    val ptinfo: ProcTaskinfo,
)
