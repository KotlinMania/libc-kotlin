package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class CAnonymousCrPid(
    val crPid: Int? = null,
)
