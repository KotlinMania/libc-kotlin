package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class PtraceScRet(
    val srRetval: List<Long>,
    val srError: Int,
)
