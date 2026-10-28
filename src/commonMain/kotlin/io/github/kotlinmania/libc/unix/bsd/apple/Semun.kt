package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class Semun(
    val value: Int? = null,
    val buf: SemidDs? = null,
    val array: UShort? = null,
)
