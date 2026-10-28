package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class Pad128T(
    val l: IntArray? = null,
)
